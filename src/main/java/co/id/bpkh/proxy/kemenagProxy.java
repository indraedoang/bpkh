package co.id.bpkh.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.id.bpkh.model.keberangkatan;
import co.id.bpkh.model.messageKemenag;
import feign.Headers;

@FeignClient(name="kemenag", url="haji.kemenag.go.id/")
@Headers("Accept: application/json")
public interface kemenagProxy {

	@Headers(
			"Content-Type: application/json"
			)
	@GetMapping("/api/bpkh/keberangkatan/MES/1440/1")
	public keberangkatan bpkh(@RequestHeader(value = "rqid", required = true) String authorizationHeader);
	@Headers(
			"rqid : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjEwMSIsImVtYWlsIjoidGVzdEBtYWlsLmNvbSIsImlhdCI6MTU4OTcxMjI5MywiZXhwIjoxNTkwNTc2MjkzfQ.YqYN7H3AumX_XenRxxwd9WdwSgjrtejWOO1JL6W9zpY"
			)
	@RequestMapping("/api/bpkh/porsi/2019-04-12/01")
	public messageKemenag getdata();
}
