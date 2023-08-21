
package ficheroserializado;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MeuObjectOutpuStrem  extends ObjectOutputStream{
    public MeuObjectOutpuStrem ()throws IOException{
        super();
        
    }
    
     public MeuObjectOutpuStrem (OutputStream x)throws IOException{
         super(x);
         
     }

    @Override
   protected void writeStreamHeader()throws IOException{
       
   }
     
    
}

