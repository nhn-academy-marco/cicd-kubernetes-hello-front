package net.java21.hello.front.client;

import lombok.RequiredArgsConstructor;
import net.java21.hello.front.dto.MemberResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;

@RequiredArgsConstructor
@Component
public class MemberClient {

    private final RestClient restClient;

    public List<MemberResponse> getMembers(){
        MemberResponse[] memberResponseArray = restClient.get().uri("/api/members").retrieve().body(MemberResponse[].class);
        return List.of(memberResponseArray);
    }

}
