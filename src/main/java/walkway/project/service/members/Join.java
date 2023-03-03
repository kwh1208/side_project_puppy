package walkway.project.service.members;

public class Join {
    //회원가입 정보 받아오기
    Long dummy1;
    String dummy2;
    String dummy3;
    MembersRepository membersRepository = new MembersRepository(dummy1, dummy2, dummy3);

    //있는 사람인지 확인
    //있으면
    //이미 가입한 회원입니다.
    //없으면
    //DBInsert.insert(membersRepository);
}
