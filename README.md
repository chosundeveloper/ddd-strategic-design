# 키친포스

## 퀵 스타트

```sh
cd docker
docker compose -p kitchenpos up -d
```

## 요구 사항

### 상품

- 상품을 등록할 수 있다.
- 상품의 가격이 올바르지 않으면 등록할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 이름이 올바르지 않으면 등록할 수 없다.
    - 상품의 이름에는 비속어가 포함될 수 없다.
- 상품의 가격을 변경할 수 있다.
- 상품의 가격이 올바르지 않으면 변경할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 가격이 변경될 때 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 크면 메뉴가 숨겨진다.
- 상품의 목록을 조회할 수 있다.

### 메뉴 그룹

- 메뉴 그룹을 등록할 수 있다.
- 메뉴 그룹의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴 그룹의 이름은 비워 둘 수 없다.
- 메뉴 그룹의 목록을 조회할 수 있다.

### 메뉴

- 1 개 이상의 등록된 상품으로 메뉴를 등록할 수 있다.
- 상품이 없으면 등록할 수 없다.
- 메뉴에 속한 상품의 수량은 0 이상이어야 한다.
- 메뉴의 가격이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴는 특정 메뉴 그룹에 속해야 한다.
- 메뉴의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 이름에는 비속어가 포함될 수 없다.
- 메뉴의 가격을 변경할 수 있다.
- 메뉴의 가격이 올바르지 않으면 변경할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴를 노출할 수 있다.
- 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 높을 경우 메뉴를 노출할 수 없다.
- 메뉴를 숨길 수 있다.
- 메뉴의 목록을 조회할 수 있다.

### 주문 테이블

- 주문 테이블을 등록할 수 있다.
- 주문 테이블의 이름이 올바르지 않으면 등록할 수 없다.
    - 주문 테이블의 이름은 비워 둘 수 없다.
- 빈 테이블을 해지할 수 있다.
- 빈 테이블로 설정할 수 있다.
- 완료되지 않은 주문이 있는 주문 테이블은 빈 테이블로 설정할 수 없다.
- 방문한 손님 수를 변경할 수 있다.
- 방문한 손님 수가 올바르지 않으면 변경할 수 없다.
    - 방문한 손님 수는 0 이상이어야 한다.
- 빈 테이블은 방문한 손님 수를 변경할 수 없다.
- 주문 테이블의 목록을 조회할 수 있다.

### 주문

- 1개 이상의 등록된 메뉴로 배달 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 포장 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 매장 주문을 등록할 수 있다.
- 주문 유형이 올바르지 않으면 등록할 수 없다.
- 메뉴가 없으면 등록할 수 없다.
- 매장 주문은 주문 항목의 수량이 0 미만일 수 있다.
- 매장 주문을 제외한 주문의 경우 주문 항목의 수량은 0 이상이어야 한다.
- 배달 주소가 올바르지 않으면 배달 주문을 등록할 수 없다.
    - 배달 주소는 비워 둘 수 없다.
- 빈 테이블에는 매장 주문을 등록할 수 없다.
- 숨겨진 메뉴는 주문할 수 없다.
- 주문한 메뉴의 가격은 실제 메뉴 가격과 일치해야 한다.
- 주문을 접수한다.
- 접수 대기 중인 주문만 접수할 수 있다.
- 배달 주문을 접수되면 배달 대행사를 호출한다.
- 주문을 서빙한다.
- 접수된 주문만 서빙할 수 있다.
- 주문을 배달한다.
- 배달 주문만 배달할 수 있다.
- 서빙된 주문만 배달할 수 있다.
- 주문을 배달 완료한다.
- 배달 중인 주문만 배달 완료할 수 있다.
- 주문을 완료한다.
- 배달 주문의 경우 배달 완료된 주문만 완료할 수 있다.
- 포장 및 매장 주문의 경우 서빙된 주문만 완료할 수 있다.
- 주문 테이블의 모든 매장 주문이 완료되면 빈 테이블로 설정한다.
- 완료되지 않은 매장 주문이 있는 주문 테이블은 빈 테이블로 설정하지 않는다.
- 주문 목록을 조회할 수 있다.

## 용어 사전
| 한글명 | 영문명 | 설명 |

### 상품
| 상품 | product | 고객이 주문하는 메뉴의 구성 요소 |
| 상품 가격 | product price | 상품의 가격 |
| 비속어 | profanity | 상품 이름 등록 시 비속어를 사용할 수 없다. |

### 메뉴
| 메뉴 그룹 | menu group | 메뉴의 집합 |
| 메뉴 | menu | 손님이 키친포스에서 메뉴판에서 확인할 수 있고 직접 주문할 수 있는 단위. 예) 후라이드 두마리 세트 |
| 비속어 | profanity | 메뉴 이름 등록 시 비속어를 사용할 수 없다. |
| 메뉴 상품 | menu product | 메뉴에서 사용되는 수량이 포함된 상품 |
| 메뉴 가격 | menu price | 메뉴의 가격 |
| 노출 | visible | 메뉴를 포스에서 나타낸다. |
| 숨김 | invisible | 메뉴를 포스에서 숨긴다. |

### 주문
#### 공통
| 주문 가격 | order price | 주문의 가격 |
| 주문 상태 | order status | 주문의 단계|
| 주문 | order | 상품을 주문하는 행위 |
| 주문 항목 | order line item | 주문에서 사용되는 수량이 포함된 메뉴 |
| 주문 유형 | order type | 주문 방식 |
| 주문 요청 | waiting | 주문을 신청한 상태 |
| 주문 접수 | accepted | 주문을 매장에서 수락한 주문 상태. |
| 주문 완료 | completed | 모든 주문 과정이 종료된 주문 상태. |
| 배달 주문 | ┢ delivery order | 주문 유형의 한 종류이다. 주문 후 배송지로 배송된다. |
| 매장 주문 | ┢ eat in order | 주문 유형의 한 종류이다. 주문 후 매장에서 식사한다. |
| 포장 주문 | ┕ takeout order | 주문 유형의 한 종류이다. 주문 후 직접 찾아간다. |

#### 배달 주문
| 배달 주문 프로세스 | | 주문 요청 -> 주문 접수 -> 배달 준비 완료 -> 배달 중 -> 배달 완료 -> 주문 완료 |
| 배달 주소 | delivery address | 주문 상품을 수령하는 주소 |
| 배달 준비 완료 | served | 모든 주문 항목이 손님에게 전달할 수 있도록 준비된 주문 상태. |
| 배달 중 | delivering | (배달) 주문을 배달 대행사가 배달 중인 주문 상태. |
| 배달 완료 | delivered | (배달) 주문을 배달 대행사가 배달 주소지까지 배달한 주문 상태. |
| 배달 대행사 | delivery agency | 배달을 대행하는 업체 |

#### 포장 주문
| 포장 주문 프로세스 | | 주문 요청 -> 주문 접수 -> 포장 완료 -> 주문 완료 |
| 포장 완료 | served | 주문 유형의 한 종류이다. 주문 후 직접 찾아간다. |

#### 매장 주문
| 매장 주문 프로세스 | | 주문 요청 -> 주문 접수 -> 서빙 완료 -> 주문 완료 |
| 서빙 완료 | served | 매장 내에서 주문 테이블에 상품을 전달한다. |
| 빈 테이블 | empty table | 테이블의 착석 인원이 없을 경우 |
| 주문 테이블 | order table | 매장 주문 시 선택하는 테이블 |
| 방문한 손님 수 | number of guests | 매장 내에서 주문한 테이블당 손님의 수 |

## 모델링
### 상품
- `상품(product)`은 이름과 `상품 가격(product price)`을 가진다.
- `상품(product)` 이름에는 `비속어(profanity)`가 포함될 수 없다.
- `상품 가격(product price)`은 0원 이상이어야 한다.
- `상품 가격(product price)`을 변경할 수 있다.

### 메뉴
- `메뉴 그룹(menu group)`은 반드시 이름을 갖는다.
- `메뉴(menu)`는 하나의 `메뉴 그룹(menu group)`에 속해야 한다.
- `메뉴(menu)`는 `메뉴 상품(menu product)`, `메뉴 가격(menu price)`, 이름을 가진다.
- `메뉴(menu)` 이름에는 `비속어(profanity)`가 포함될 수 없다.
- `메뉴 가격(menu price)`은 변경될 수 있고, `메뉴 상품(menu product)`의 합보다 작거나 같아야 한다.
- `메뉴 가격(menu price)`은 0원 이상이어야 한다.
- `메뉴 상품(menu product)`은 `상품(product)`과 수량을 갖는다.
- `메뉴(menu)`를 `노출(visible)` 하거나 `숨기기(invisible)`를 할 수 있다.
- `메뉴 가격(menu price)`이 `메뉴 상품(menu product)` 합보다 높을 경우 `메뉴(menu)`를 `노출(visible)`할 수 없다.

### 주문
#### 공통
- `주문(order)`은 주문 상태, `주문 항목(order line item)`, `주문 유형(order type)`을 가진다. 
- `주문 항목(order line item)`은 수량을 가진다.
- 주문한 `메뉴 가격(menu price)`은 실제 `메뉴 가격(menu price)`과 일치해야 한다.

#### 배달 주문
- `배달 주문(delivery order)`은 반드시 `배달 주소(delivery address)`를 가진다.
- `배달 주문(delivery order)`은 `주문 요청(waiting)` -> `주문 접수(accepted)` -> `배달 준비 완료(served)` `배달 중(delivering)` -> `배달 완료(delivered)` -> `주문 완료(completed)` 순으로 진행된다.
- `배달 주문(delivery order)`이 `주문 접수(accepted)`되면 `배달 대행사(delivery agency)`를 호출한다.
- `배달 주문(delivery order)` 의 경우 `주문 항목(order line item)` 의 수량이 0보다 커야 한다.

#### 포장 주문
- `포장 주문(delivery order)`은 `주문 요청(waiting)` -> `주문 접수(accepted)` -> `포장 완료(served)` -> `주문 완료(completed)` 순으로 진행된다.
- `포장 주문(delivery order)` 의 경우 `주문 항목(order line item)` 의 수량이 0보다 커야 한다.

#### 매장 주문
- `매장 주문(eat in order)`은 `주문 요청(waiting)` -> `주문 접수(accepted)` -> `서빙 완료(served)` -> `주문 완료(completed)`순으로 진행된다.
- `주문 테이블(order table)`은 이름, `방문한 손님 수(number of guests)`을 갖는다.
- `주문 테이블(order table)`의 이름은 비워 둘 수 없다.
- `방문한 손님 수(number of guests)`는 변경할 수 있으며 0명 이상이어야 한다.
- `주문 완료(completed)`되면 `주문 테이블(order table)`을 `빈 테이블(empty table)`로 설정한다.
- `빈 테이블(empty table)`은 `방문한 손님 수(number of guests)`를 변경할 수 없다.
- `매장 주문(delivery order)` 의 경우 `주문 항목(order line item)` 의 수량이 0보다 작을 수 있다.
