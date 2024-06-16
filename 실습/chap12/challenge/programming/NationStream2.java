package programming_12;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import chapter_12.Nation;

public class NationStream2 {

	public static void main(String[] args) {
        Map<Nation.Type, Map<String, List<String>>> groupedNations = Nation.nations.stream()
                .collect(Collectors.groupingBy(
                        Nation::getType,
                        LinkedHashMap::new, // LinkedHashMap을 사용하여 순서를 유지
                        Collectors.groupingBy(
                                nation -> {
                                    if (nation.getGdpRank() <= 12) {
                                        return "선진국";
                                    } else {
                                        return "개도국";
                                    }
                                },
                                Collectors.mapping(Nation::getName, Collectors.toList())
                        )
                ));

        // 결과 출력
        System.out.println(groupedNations);
    }

}
