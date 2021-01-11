<!-- 마크다운 정리 파일 -->
<!--  헤더(#의 갯수로 글자 크기 지정) HTML H테그와 비슷한 느낌으로 6단계 까지 가능 -->
# 헤더
## 헤더
### 헤더
#### 헤더
##### 헤더
###### 헤더

<!-- 순서 있는 리스트 (숫자. 으로 표시)-->
1. 순서리스트
2. 순서리스트
3. 순서리스트
4. 순서리스트
5. 순서리스트

<!-- 순서 없는 리스트 (*,+,-)를 붙여서 표현-->
* 순서없는리스트
+ 순서없는리스트
- 순서없는리스트

<!-- 문단 나누기 (***,---,___ 3개이상 사용시)HTML HR태그와 비슷한 결과-->
*** 
--- 
___ 
<!-- 3개 이상은 전부 동일한 결과 -->
_______


<!-- 텍스트 출력 (별도의 특수문자 없이 입력시 전부 텍스트 처리)-->
텍스트 입력 별도의 특수문자 없이 입력시 전부 텍스트 처리 가능

<!--텍스트 강조 하기 -->
<!-- *텍스트*  OR  _텍스트_ (기울임채)-->
*기울임체*
_기울임체_

<!-- ** 텍스트 ** (굵은 글씨체)-->
**굵은 글씨체**
__굵은 글씨체__

<!-- 기울임 + 굵은 글씨체 -->
***기울임+굵은글씨체***

<!-- 취소선 -->
~~취소선~~

<!-- 인용문(들여쓰기 가능) 꺽쇠 >의 갯수를 통해서 들여쓰기 레벨 조종-->
> 인용문입니다
> 인용중입니다
> 인용문입니다
> >인용문안에서 또 인용가능

<!-- 소스코드작성시 사용-->
<!-- 탭으로 들여쓰기 OR 띄어쓰기 4번 -->
    public class main {
        public static void main(String [] args){
            System.out.println("소스코드예제");
        }
    }
<!--- ~~~소스코드~~~ -->
~~~
물결 사이에도 소스코드? 되는 이유 모르겠다.
~~~

<!-- ```소스코드``` -->
```
소스코드 작성가능
```

<!-- 인라인 코드 작성(한줄에 소스코드 추가)-->
<!-- `소스코드` -->
인라인 코드를 한줄에 넣을때 `int i = o;` 이런식으로 그레이브 키 1개 사이에 쓰면 작성가능하다.

<!-- 테이블 귀찮으니 그냥 테이블 사진만들어서 사진으로 올리는것이 더 편하다-->

|테이블헤더|테이블헤더|테이블헤더
|---|---|---
|내용|내용|내용|
|내용|내용|내용|
|내용|내용|내용|

<!-- 테이블 정렬할때-->
|테이블헤더|테이블헤더|테이블헤더|
|:-----|-----:|:---:|
|왼쪽정렬|오른쪽정렬|중앙정렬|
|!--헤더밑오른쪽에붙이기|헤더밑왼쪽에붙이기--!|:헤더양쪽에 넣기:|

<!-- 링크 걸기 -->
<!-- [링크걸 문구](주소값)-->
[네이버](www.naver.com)

<!--이미지 링크 걸기-->
<!-- ![이미지이름](이미지 주소)  -->
![샘플이미지](./sampleImage.jpeg)

<!-- 주석은 HTML과 동일하게 작성하면 된다 -->