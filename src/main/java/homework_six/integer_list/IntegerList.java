package homework_six.integer_list;

import java.util.List;

public class IntegerList {
    private final List<Integer> list;

    public IntegerList(List<Integer> list) {
        this.list = list;
    }

    public int getList(int index) {
        return list.get(index);
    }

    public void setList(int number) {
        list.add(number);
    }

    public int findAverageNum() {
        int result = 0;

        for (Integer number: list)
            result += number;

        return result / list.size();
    }
}
