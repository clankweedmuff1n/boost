package com.blazing.boost.scraper;

import com.blazing.boost.order.dto.OrderDTO;
import com.blazing.boost.order.dto.ResponseDTO;
import com.blazing.boost.order.entity.service.OrderService;
import com.blazing.boost.order.mapper.order.OrderMapper;
import com.blazing.boost.order.entity.repository.OrderRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Data
@Service
@RequiredArgsConstructor
public class ScraperImpl implements Scraper {
    private final RestTemplate restTemplate;
    private final OrderService orderService;

    @Override
    public HttpHeaders getRequestHeaders(String cookie) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "*/*");
        headers.set("Accept-Language", "ru,en;q=0.9");
        headers.set("Priority", "u=1, i");
        headers.set("sec-ch-ua", "\"Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"YaBrowser\";v=\"24.7\", \"Yowser\";v=\"2.5\"");
        headers.set("sec-ch-ua-arch", "\"x86\"");
        headers.set("sec-ch-ua-bitness", "\"64\"");
        headers.set("sec-ch-ua-full-version", "\"24.7.2.1098\"");
        headers.set("sec-ch-ua-full-version-list", "\"Not/A)Brand\";v=\"8.0.0.0\", \"Chromium\";v=\"126.0.6478.234\", \"YaBrowser\";v=\"24.7.2.1098\", \"Yowser\";v=\"2.5\"");
        headers.set("sec-ch-ua-mobile", "?0");
        headers.set("sec-ch-ua-model", "\"\"");
        headers.set("sec-ch-ua-platform", "\"Windows\"");
        headers.set("sec-ch-ua-platform-version", "\"15.0.0\"");
        headers.set("sec-fetch-dest", "empty");
        headers.set("sec-fetch-mode", "cors");
        headers.set("sec-fetch-site", "same-origin");
        headers.set("cookie", cookie);
        headers.set("Referer", "https://blazingboost.com/booster/pick-services");
        headers.set("Referrer-Policy", "strict-origin-when-cross-origin");
        return headers;
    }

    @Scheduled(fixedDelay = 360)
    public void checkOrders() {
        String cookie = "__eventn_id=aq5rn6djwt; _fbp=fb.1.1691717656436.673442463; _tt_enable_cookie=1; _ttp=3zgoAjq9RCcKud1zdkcrNoqxaOa; _hjSessionUser_1777838=eyJpZCI6IjRhODU3ODk4LTIxZGUtNTk4Zi1iNjY0LTMxNDZhNmRlZjFkYyIsImNyZWF0ZWQiOjE2OTE3MTc2NTU5NzIsImV4aXN0aW5nIjp0cnVlfQ==; _ga_PRX8MCBY3Z=deleted; __eventn_id_usr=%7B%22email%22%3A%22germanzzxxcc%40gmail.com%22%2C%22id%22%3A%22B222634A3C%22%7D; _uetvid=2f068c2037e711eebf89213d1b566c13; _ga=GA1.1.56998743.1691717654; _ga_WVHEEH98H0=GS1.1.1696772456.93.1.1696806857.0.0.0; PAPVisitorId=JLqBIqHDMDv3hHINaNtwzBiw6pDmpWoo; _gcl_au=1.1.462434630.1723791175; _gid=GA1.2.1099223966.1725028426; PHPSESSID=8a16fb6e33eb1437a13ce37c2b5dcf82; _clck=18a8gb7%7C2%7Cfou%7C0%7C1318; cf_clearance=w7tU_gXelWb7ICXfy8NxnuDdF5B2KFlGoY27c.4DoVQ-1725236253-1.2.1.1-mrpGFWnC3L_kNAST77aIfP6tS_8gO8YXw83210bBHnybnMK47LsUs7tFHPWB2yseXIJqXVFdJms7ydyggW7idep4fAnM1160IcRDOgqUBM2YiAb.pfF5EpUgx.i_OR5p5zIAE.QNBDcEmfo8dRfScBFqzx7e8ASo3FCv0HSDveKIc3ikIlktzFqE2FcMH2xTE7z12KTDh5XtSO_jeaNnIDmBljUK48LzBujmiWrZr4sT.pQgvJa9TfQyV_NQhjPUxqTKMx9BxhUuJYjH0xwaF7sNwh8nFxamDuJqwPDlRsTWeFP7CM3KLvoByfKIpod0t3E8jyPc5ArLF39QnMsbSgMugaGcZ8_km1saR9Mc5q2_TduSWE8Q0k8SNHEmnWT2vYNJocWwbOGbUwcV85f0EAp7CjdXp.VY1271sP5bCiSaHcBEVVkq.T4JYM6GzqoQSRAGB6aeZKj1z_rcKJMFJA; _hjSession_1777838=eyJpZCI6IjcxN2MzMjNmLTdmNzYtNDFkNi05NTY5LTkxMGM5NmFkM2I4ZiIsImMiOjE3MjUyODAzMTA1MzAsInMiOjEsInIiOjEsInNiIjowLCJzciI6MCwic2UiOjAsImZzIjowLCJzcCI6MX0=; _uetsid=df74cf8066dc11ef81b5d314c7b82f73; _iub_cs-80195657=%7B%22consent%22%3Atrue%2C%22timestamp%22%3A%222023-11-10T02%3A05%3A07.146Z%22%2C%22version%22%3A%221.52.1%22%2C%22id%22%3A80195657%2C%22cons%22%3A%7B%22rand%22%3A%228c184b%22%7D%7D; _ga_PRX8MCBY3Z=GS1.1.1725280312.444.1.1725280316.56.0.0; _ga_WVHEEH98H0=GS1.2.1725280317.165.0.1725280317.0.0.0; _ga=GA1.2.56998743.1691717654; _clsk=1r7fbht%7C1725281011541%7C4%7C1%7Cq.clarity.ms%2Fcollect";
        HttpEntity<ResponseDTO> entity = new HttpEntity<>(getRequestHeaders(cookie));

        ResponseEntity<ResponseDTO> response = restTemplate.exchange(
                "https://blazingboost.com/v1/pick-services?game=7",
                HttpMethod.GET,
                entity,
                ResponseDTO.class
        );

        for (OrderDTO orderDTO : response.getBody().getItems()) {
            orderService.saveOrder(orderDTO);
        }
    }
}
