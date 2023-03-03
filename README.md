
# 0226 1st Meeting

## [1] Discussion
## 기획은 그대로 유지하나요?
### Topic
  - 산책로 추천 앱으로 확정?
  - 새로운 아이디어 또는 베이스 생성 후 재선택?

### Discussion
- 나무님은 Main을 산책로로 생각중이지만, 부가적인 기능 추가를 고려하고 있습니다.
- 정우님은 설문조사와 MBTI를 이용해 사용자와 어울리는 개 종 추천 홍보용 앱을 만들면 앱 사용량이 늘 것 같다는 의견을 제시했습니다.

## 회의 내용 어디다가 정리할까요?
 ### Topic
  1. Github readme
  2. Notion
  3. Tistory

### Discussion
- 나무님은 Tistory도 애매하고 Notion이 용도에 정확히 맞지 않다는 의견을 제시했습니다.
- 정우님과 의견이 일치해서 Github에 마크다운 형식으로 회의록을 정리합니다.

## 버전 통일 어떻게 할까요?
### Topic
- Spring, Spring boot
- MySql
- Kotlin 
- Web 
      - Thymeleaf
      - CRUD input box (디버깅용)

### Fixed Verision
- JDK 8
- Spring boot 2.7
- MySql 8.0
- Using Gradle


## Plan

### [1]회차
#### To Do
1. MySql DB 만들기 (SQL문으로 생성)
2. 객체 DTO 만들기
3. Service 만들기
4. Controller 만들기
5. Spring boot - Mybatis CRUD

### [2]회차 (Web)
#### To Do
1. [공공서비스 데이터 가져와서, MYSQL로 넣어주기]
2. 회원가입 (authentication) 로그인 (log-in)
`Kakao, Naver, Google, email Lo`

### [3]회차
#### To Do
1. 산책로 추천 기준 3개 생성, 기준 추가
- Like Count (patch 몇시간에 한번씩 업데이트할지 쓰레드)
- 인구 밀집도
-  산책 시간
 
`산책로 table (trail, walk way) Example`
```sql
- 이름 : Name
- 위치 : location
- 좌표 : coordinates
- 추천수 : like count
- 인구 밀집도 : traffic
- 평균 산책 시간 : trail time
- 오픈카카오톡 : url
```

### [4]회차 ~ [6]회차
#### To do
- 정우 : Kotlin, 위치 기반 서비스 (공부) * 해보고 어려우면, 사용자가 위치 입력!
- 나무 : 기능 추가, 벡엔드 정리

### [7]회차
- 정우 : 앱 플레이스토어 출시
- 나무 : 최종 테스트 및 기능 리스트 정리

```
기능 관련 아이디어
- Web View
- Contact만 띄우기
- 산책로의 오픈카카오톡방 찾아서 연결해주기
- 홍보용 MBTI 만들기
- Unit Test 꾸준히 만들기 (TDD 해주기)

보류
- Open Ai 라이브러리 -> 이런이런 산책로 추천해줘! -> 추천해주는 기능
- 주변 산책로 추천 --> random 산책로 주기.. ?
```
