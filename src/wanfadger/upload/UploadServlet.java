package wanfadger.upload;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import project.database.DBConnection;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		//InputStream inputStream = null; // input stream of the upload file
        //String name = null;
        	//	long size =0;
        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("photo");
        if (filePart != null) {
        	System.out.println("am ready to upload");
            // prints out some information for debugging
          //   name = filePart.getName();
            // size = filePart.getSize();
             //System.out.println(name);
            //System.out.println(filePart.getContentType());
             
            // obtains input stream of the upload file
            //inputStream = filePart.getInputStream();
        }else {
        	out.write("its empty");
        }
        
        // constructs SQL statement
       // String sql = "INSERT INTO uploads (image_name, image_size, image) values (?, ?, ?)";
      // Connection conn = DBConnection.getConnection();
        
        //String message;
		
		//	try {
		///		PreparedStatement pst = conn.prepareStatement(sql);
			//	pst.setString(1, name);
		      //  pst.setLong(2, size);
		         
		      //  if (inputStream != null) {
		            // fetches input stream of the upload file for the blob column
		        //    pst.setBlob(3, inputStream);  
		       // }/
		        //run
		        //int i = pst.executeUpdate();
		       // if(i>0) {
		        //	out.write("uploded");
		       // }else {
		        //	out.write("failed");
		       // }

			//} catch (SQLException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
		//	}
        
}
}
