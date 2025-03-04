package com.kihongkjim.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application2 {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("0001", "홍길동", Arrays.asList("노트북", "마우스"), 1200.0, "배송 완료"),
                new Order("0002", "김철수", Arrays.asList("스마트폰"), 800.0, "배송 중"),
                new Order("0003", "이영희", Arrays.asList("태블릿", "키보드"), 600.0, "배송 완료"),
                new Order("0004", "박민수", Arrays.asList("모니터"), 300.0, "배송 중")
        );

        // 1. 배송 완료 상태의 주문 ID 리스트를 반환
        List<String> completedOrderIds = orders.stream()
                .filter(order -> "배소완료".equals(order.getStatus()))
                .map(Order::getOrderId)
                .collect(Collectors.toList());

        // 2. 각 고객이 주문한 총 금액을 계산하여 맵으로 반환
        Map<String, Double> totalAmountBycustomer = orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomerName, Collectors.summingDouble(Order::getTotalAmount)));

        // 3. 가장 높은 주문 금액을 가진 고객의 이름을 반환
        String highestOrderCustomer = orders.stream()
                .max(Comparator.comparingDouble(Order::getTotalAmount))
                .map(Order::getCustomerName)
                .orElse(null);

        System.out.println(completedOrderIds);
        System.out.println(totalAmountBycustomer);
        System.out.println(highestOrderCustomer);
    }
}
