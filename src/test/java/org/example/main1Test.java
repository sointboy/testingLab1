package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class main1Test {
    @Test
    public void main(){
            int b = 195; //переменная 1
            int c = 210;
            int a = main1.main(b,c);
            assertEquals(-15,a);
    }


}