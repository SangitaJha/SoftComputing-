public static boolean onlyoddNumbers(List<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
        if (i % 2 == 0)
            return false;
    }

    return false;
}
