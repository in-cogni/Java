import javax.xml.crypto.Data;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.sql.SQLOutput;
import java.util.List;
void main(){
    //долго
    /*try(InputStream in = new FileInputStream("")){
        int b;
        while((b=in.read())!=-1){
            //
        }
    }*/

    long start = System.currentTimeMillis();
    try(FileInputStream in = new FileInputStream("output.txt")){
        int b;
        while((b=in.read())!=-1){
            //
        }
    }catch (IOException e){
        System.out.println(e.getMessage());
    }
    long end = System.currentTimeMillis();
    System.out.println("Чтение по одному байту "+(end-start)+" ms");

    long startB = System.currentTimeMillis();
    try(BufferedInputStream in = new BufferedInputStream(new FileInputStream("output.txt"))){
        int b;
        while((b=in.read())!=-1){
            //
        }
    }catch (IOException e){
        System.out.println(e.getMessage());
    }
    long endB = System.currentTimeMillis();
    System.out.println("Чтение с буффером "+(endB-startB)+" ms");

    try(RandomAccessFile file = new RandomAccessFile("output.txt", "r")){
        FileChannel channel = file.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int byteRead = channel.read(buffer);
        while(byteRead!=-1){
            buffer.flip();
            while(buffer.hasRemaining()){
                System.out.println((char) buffer.get());
            }
            buffer.clear();
            byteRead = channel.read(buffer);
        }
    }catch (IOException e){
        System.out.println(e.getMessage());
    }

    try(RandomAccessFile file = new RandomAccessFile("output.txt", "rw")){
        FileChannel channel = file.getChannel();
        ByteBuffer buffer = ByteBuffer.wrap("skljd".getBytes());
        channel.write(buffer);
        channel.position(100);
        channel.truncate(1024);
        buffer.capacity();
        buffer.limit();
        buffer.mark();
        buffer.clear();
    }catch (IOException e){
        System.out.println(e.getMessage());
    }

    try{
        ByteBuffer buffer = ByteBuffer.allocate(8);
        buffer.put((byte) 42);
        buffer.flip();
        byte value = buffer.get();
        buffer.clear();
    }catch (Exception e){
        System.out.println(e.getMessage());
    }

    try(FileChannel src = FileChannel.open(Paths.get("output.txt"), StandardOpenOption.READ);
        FileChannel dst = FileChannel.open(Paths.get("input.txt"), StandardOpenOption.CREATE)){
        long size = src.size();
        long transfer = src.transferTo(0, size, dst);
    }catch (IOException e){
        System.out.println(e.getMessage());
    }

    try(FileChannel raf = FileChannel.open(Paths.get(""), StandardOpenOption.READ)){
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        raf.position();
        int byteRead = raf.read(byteBuffer);
    }catch (IOException e){
        System.out.println(e.getMessage());
    }
}
