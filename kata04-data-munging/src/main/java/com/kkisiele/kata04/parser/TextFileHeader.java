package com.kkisiele.kata04.parser;

class TextFileHeader {
    private final String name;
    private final int offset;
    private TextFileHeaders container;

    public TextFileHeader(String name, int offset) {
        this.name = name;
        this.offset = offset;
    }

    public void setContainer(TextFileHeaders container) {
        this.container = container;
    }

    public String name() {
        return name;
    }

    public int offset() {
        return offset;
    }

    public boolean hasName(String name) {
        return name().equals(name);
    }

    public boolean hasNextHeader() {
        return nextHeader() != null;
    }

    public TextFileHeader nextHeader() {
        return container.nextTo(this);
    }
}