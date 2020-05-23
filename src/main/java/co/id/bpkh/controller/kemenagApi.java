package co.id.bpkh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.id.bpkh.model.keberangkatan;
import co.id.bpkh.proxy.kemenagProxy;

@CrossOrigin(origins="*",maxAge=3600)	
@RestController
public class kemenagApi {
	@Autowired
	kemenagProxy proxy;
	@GetMapping("/api/kemenag/keberangkatan")
	public keberangkatan index()
	{
		String Token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjEwMSIsImVtYWlsIjoidGVzdEBtYWlsLmNvbSIsImlhdCI6MTU4OTcwOTAyNSwiZXhwIjoxNTkwNTczMDI1fQ.scuWX_G9yUrmFZ8zswrtZKoSXbiKI-cu3HEizbp5jHc";
		String rqid = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjEwMSIsImVtYWlsIjoidGVzdEBtYWlsLmNvbSIsImlhdCI6MTU4OTcxMjI5MywiZXhwIjoxNTkwNTc2MjkzfQ.YqYN7H3AumX_XenRxxwd9WdwSgjrtejWOO1JL6W9zpY";
		return proxy.bpkh(rqid);
	}
	

}
