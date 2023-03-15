package walkway.project.controller;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Temporary {
    //데이터 가져오기
    @GetMapping
    void tmp_town(HttpServletRequest request, HttpServletResponse response){
        request.getParameter("town");
        //좌표도 가져왔다고 치고!


        //좌표 변환해야됨.
        double start_x=0;
        double start_y=0;
        double end_x=0;
        double end_y=0;

        coordinate coordinate = new coordinate(start_x, start_y, end_x, end_y);

        String LineString = coordinate.toString(); //형식에 맞춰서 다시 해야됨 형식 : LINESTRING(x1 y1,x2 y2)
        //url 로 요청보내기
        //https://api.vworld.kr/req/data?request=GetFeature&key=A8519530-033F-38CB-865B-D8CD178C5CFF&data=LT_L_TRKROAD&geomFilter=라인스트링들어갈 자리&crs=EPSG:900913
        String json = null;//url 에서 가져온 정보 담기-> 반환
    }
    @GetMapping
    void tmp_coordinate(HttpServletRequest request, HttpServletResponse response){
        request.getParameter("coordinate");
        //좌표변환
    }
    @AllArgsConstructor
    @Getter
    @ToString
    public class coordinate{
        private double start_x;
        private double start_y;
        private double end_x;
        private double end_y;
    }
}
/*
* 일단 동네를 입력받고 -> 해당 동이 있는 구로 변환 -> DB에 넣어서 산책로 좌표받아오고 -> 해당좌표 google map으로 산책로 띄워서 -> 프론트로 쏴주기.
* 필요한 인터페이스 - 구(동네 매칭): 동네 이름을 key값으로 구를 value로 저장.(DB에 넣어놓고 받아온다음에 저장해놓기.)
*                - 맵 : 구글맵에서 다른거로 변경될 수도 있으니까
*                - 멤버 : 일단은 필요한거는 인증이 되어있느냐 아니냐?만 넣었는데 추가될 수도 있으니까.
*                - 좌표
* */