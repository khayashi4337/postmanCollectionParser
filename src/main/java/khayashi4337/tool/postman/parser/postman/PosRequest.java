package khayashi4337.tool.postman.parser.postman;

import khayashi4337.tool.postman.parser.postman.header.PosHeader;

public class PosRequest {
	public PosAuth auth;
	public String method;
	public PosHeader header;
	public PosBody body;
	public String url;
}
