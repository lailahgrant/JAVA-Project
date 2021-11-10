package wanfadger.upload;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class UploadCommonServlet
 */
@WebServlet("/UploadCommonServlet")
public class UploadCommonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadCommonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);

	//check if the parsed request is multipart
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		
		//create a factory for disk-based file items
		DiskFileItemFactory factory = new DiskFileItemFactory();
		
		//configure a repository (to ensure a secure temp location is used)
		ServletContext servletContext = this.getServletConfig().getServletContext();
		
		File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
		
		factory.setRepository(repository);
		//create  a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);
		//parse a request
		 try {
			List<FileItem> item = upload.parseRequest((RequestContext) request);
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	}

}
