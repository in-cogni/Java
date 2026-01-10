void main() {
    //1
    try(FileChannel channel = FileChannel.open(Paths.get("input.txt"), StandardOpenOption.READ)){
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int byteRead = channel.read(buffer);
        while (byteRead!=-1){
            buffer.flip();
            while (buffer.hasRemaining()){
                System.out.print((char) buffer.get());
            }
            buffer.clear();
            byteRead = channel.read(buffer);
        }
    }catch (IOException e){
        System.out.println(e.getMessage());
    }

    //2
    try(FileChannel src = FileChannel.open(Paths.get("source.bin"), StandardOpenOption.READ);
        FileChannel dst = FileChannel.open(Paths.get("copy.bin"), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)){
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int byteRead = src.read(buffer);
        while(byteRead!=-1){
            buffer.flip();
            dst.write(buffer);
            buffer.clear();
            byteRead = src.read(buffer);
        }
    }catch (IOException e){
        System.out.println(e.getMessage());
    }
}