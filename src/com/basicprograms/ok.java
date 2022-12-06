//package com.company;
//
//public class ok {
//    public static void main(String[] args) {
//       String str= solution(6,1, 1);
//        System.out.println(str);
//    }
//    public static String solution(int A, int B, int C){
//        String str ="";
//        if(A>B || A>C){
//            if(B>C){
//                int x = A-C;
//                int y = B-C;
//                for(int i=0 ; i < C; i++){
//                    str += "a";
//                    if(x > 0){
//                        str += "a";
//                        x--;
//                    }
//                    str += "b";
//                    if(y > 0){
//                        str += "b";
//                        y--;
//                    }
//                    str += "c";
//                }
//                return str;
//            }else if(B<C){
//                int x= A-B;
//                int y= C-B;
//                for(int i=0 ; i < C; i++){
//                    str += "a";
//                    if(x > 0){
//                        str += "a";
//                        x--;
//                    }
//                    str += "c";
//                    if(y > 0){
//                        str += "c";
//                        y--;
//                    }
//                    str += "b";
//                }
//                return str;
//            }else if(B==C){
//                int x= A-B;
//                int y= 0;
//                for(int i=0 ; i < =C; i++){
//                    str += "a";
//                    if(x > 0){
//                        str += "a";
//                        x--;
//                    }
//                    str += "c";
//                    if(y > 0){
//                        str += "c";
//                        y--;
//                    }
//                    str += "b";
//                }
//                return str;
//            }
//        }
//        else if(B>A || B>C){
//            if(A>C){}else if(A<C){}else if(A==C){}
//        }
//        else if(A == B){
//            if(A>C){} else if(A<C){} else if(A==C){}
//        }
//        else if(C>A || C>B){
//            if(A>B){}else if(A<B){}else if(A==B){}
//        }
//        else if(A == C){
//            if(A>B){}else if(A<B){}
//        }
//        else if (B==C){
//            if(B>A){}else if(B<A){}
//        }
//        return str;
//    }
//}
