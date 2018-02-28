/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework29;


/*

* precondition: 0 <= score <= 100

*

*/
/**
 *
 * @author Parker
 */
public class setStudentScore {
    setStudentScore(int score){
        
        if(score<= 0 || score >= 100){
            String s = "Score must be greater than 0 and less than 100";
            IllegalArgumentException e = new
            IllegalArgumentException(s);
            throw e;
        }
        
    }
}
