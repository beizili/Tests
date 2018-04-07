package com; /**
 * Created by Administrator on 2016/7/11 0011.
 */
import java.util.*;
public class GuessGame {
    int answer;
    int guess;
    boolean success;
    int counter;
    String info;
    public GuessGame(){
    reset();
    }
// 成员函数，设置和调用成员属性
    public void setGuess(String guess) {
        counter++;
        try {
            this.guess=Integer.parseInt(guess);
        }
        catch (NumberFormatException e){
            this.guess=-1;
        }
        if(this.guess==answer)
            success=true;
        else {
            if(this.guess==-1){
                info="出错，再来一次";
            }
            else if(this.guess<answer){
                info="您猜的价格小了";
            }
            else if(this.answer>answer){
                info="您猜的价格大了";
            }

        if(this.guess>1000){
            info="请输入1-1000之间的数字";
        }
        }

    }
    public boolean getSuccess(){
        return success;
    }
    public String getInfo(){
        return info;
    }
    public int getCounter(){
        return counter;
    }
    public int getAnswer(){
        return answer;
    }
    public void reset(){
        answer=Math.abs(new Random().nextInt()%1000)+1;
        success=false;
        counter=0;
    }
}