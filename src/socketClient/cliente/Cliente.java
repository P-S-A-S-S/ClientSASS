package socketClient.cliente;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import socketClient.Conexion.Conexion;
import JSONfiles.defaultCall;
import java.io.*;
import org.apache.commons.io.IOUtils;

public class Cliente extends Conexion implements Runnable
{
    public Cliente() throws IOException{super("cliente");} //Se usa el constructor para cliente de Conexion

    public void startClient() //Método para iniciar el cliente
    {
        try
        {
            //Flujo de datos hacia el servidor

            OutputStream sout = cs.getOutputStream();
            String message = defaultCall.firstCall();
            
            SendJsons.sendJsons(message, sout);
            run();
            cs.close();//Fin de la conexión

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

	@Override
	public void run() {
		InputStream sin;
		try {
			sin = cs.getInputStream();
			// String result = IOUtils.toString(sin, StandardCharsets.UTF_8);
			// Buffered reader
			System.out.println(IOUtils.toString(sin, StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}