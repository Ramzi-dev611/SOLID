package com.directi.training.lsp.example;

public class Square extends Rectangle
{
    @Override
    public void setWidth(int width)
    {
        super._width = width;
        super._height = width;
    }

    @Override
    public void setHeight(int height)
    {
        super._height = height;
        super._width = height;
    }
}
