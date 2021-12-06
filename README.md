## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback

- 문자열 을 공백으로 분리
- 문자열 의 규칙은 숫자 공백 연산자 숫자 이다.
- 연산자는 +-*/ 만 올수 있다.
- 문자열을 분리해서 사친연산을 수행한다.
- 문자열 사칙연산의 계산 우선순위가 아닌 입력값에 따라 계산 순서 결정
- 
```

```
- 숫자 맞추기
    - 볼 은 숫자와 포지션을 가진다.
    - 숫자가 같으면 볼 Umpire 
    - 숫자가 같은데 자리 까지 같으면 스트라이크 Umpire
    - 전혀 없음면 낫싱 Umpire
    - 공 3개씩 비교해서 볼의개수 ,스타리이크 개수 Umpire
    - 3스트라이크 인지
    - 낫싱,1볼 2스트라이크, 2볼 1스트라이크, 3볼, 3스트라이크,1볼,2볼,1스트라이크,2스트라이크 
    - ex e.g. 상대방(컴퓨터)의 수가 425일 때, 123을 제시한 경우 : 1스트라이크, 456을 제시한 경우 : 1볼 1스트라이크, 789를 제시한 경우 : 낫싱
- 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택
- 게임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력, 컴퓨터는 입력한 숫자에대한 결과를 출력
- 3개의 숫자를 모두 맞히면 게임 종료
- 게임을 종료한 후에 게임을 다시 시작하거나 완전히 종료할 수 있다.

```
