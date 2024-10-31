## Lv 1. 숙련 필수사항 보완하기 `필수`

- [x]  필수 과제(~Lv5) 자가평가와 튜터평가가 다른 경우, 보완합니다.

## Lv 2. 기능 개선 `필수`

- [x]  요구사항 : 아래 키워드 중 2개 이상 시도해 적용할 것
    - [x]  **유효성 검사 추가**: 입력 값에 대한 유효성 검사를 추가하여 정책에 맞는 데이터만 취합
    - [x]  **예외 처리 강화**: 적절한 예외 처리 로직을 추가하여 오류 발생 시 사용자에게 명확한 피드백 제공
        - [x]  API 예외처리
            - [x]  global 예외처리
        - [x]  단순히 400, 500 에러코드만 쥐어주기보다, 에러 메세지를 전달하도록(더 많은 정보)
    - [ ]  서비스의 도메인 로직을 엔티티에 위임하기