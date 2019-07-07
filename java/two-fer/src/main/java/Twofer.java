class Twofer {
    String twofer(String name) {
        String referedName = (name == null) ? "you" : name;
        return String.format("One for %s, one for me.", referedName);
    }
}
