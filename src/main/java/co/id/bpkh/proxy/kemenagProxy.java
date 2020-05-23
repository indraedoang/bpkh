package co.id.bpkh.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import co.id.bpkh.model.keberangkatan;
import feign.Headers;

@FeignClient(name="kemenag", url="https://haji.kemenag.go.id/")


@Headers("Accept: application/json")
public interface kemenagProxy {

	@Headers(
			"Content-Type: application/json"
			)
	@GetMapping("/api/bpkh/keberangkatan/MES/1440/1")
	public keberangkatan bpkh(@RequestHeader(value = "rqid", required = true) String authorizationHeader);
}
