package com.test;

public class Main {

    public static void main(String[] args) {
        //Задача №1
        /*int[] sortedMass = {2};
        sorting(sortedMass);*/

        //Задача №2

        int peek = 0;
        int min = 0;
        MinStack minStack = new MinStack();
        minStack.pushStack(-2);
        minStack.pushStack(0);
        minStack.pushStack(-3);
        System.out.println("Текущий стек: " + minStack.st);
        min = minStack.getMin();
        System.out.println("Min: " + min);
        peek = minStack.peekStack();
        System.out.println("Peek: " + peek);
        minStack.popStack();
        min = minStack.getMin();
        System.out.println("Min: " + min);


    }

    public static void sorting(int[] arr) {
        int first = 0;
        int cur = 1;
        int prev = cur - 1;
        String result = "";

        if (arr.length == 1) {
            result = result + arr[0];
        } else if (arr.length < 1) {
            System.out.println("Массив пустой!");
        }

        while (cur < arr.length) {

            if (arr[cur] - arr[prev] != 1) {
                //System.out.println("arr[cur] - arr[prev]: " + (arr[cur] - arr[prev]));
                if (arr[first] == arr[prev]) {
                    result = result + arr[first];
                    //System.out.println("result + arr[first]: " + result);
                } else {
                    result = result + arr[first] + "-" + arr[prev];
                    //System.out.println("result + arr[first] + '-' + arr[prev]: " + result);
                }

                if (first != arr.length - 1) {
                    result = result + ", ";
                    //System.out.println("result + , :" + result);
                }
                first = cur;
                //System.out.println("first: " + first);
                //System.out.println("cur: " + cur);
            }

            if (cur == arr.length - 1) {
                if (first == cur) {
                    result = result + arr[first];
                    //System.out.println("result + arr[first]:" + result);
                } else {
                    result = result + arr[first] + "-" + arr[cur];
                    //System.out.println("result + arr[first] + '-' + arr[cur]: " + result);
                }
                break;
            } else {
                cur++;
                //System.out.println("cur++: " + cur++);
                prev = cur - 1;
                //System.out.println("prev: " + prev);
            }
        }

        System.out.println("Отсортированный массив: " + result);
    }
}







