package tw.org.iii.homework;


import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.*;

import java.util.*;
import java.util.HashSet;

public class Act extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act);

        InitialComponent();
    }

    private View.OnClickListener btnOk_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (s5 != "") {
                length1 = (double)(x1.getText().length());

                if (length1 > 0) {
                    s1=usernumber[0];
                    s2=usernumber[1];
                    s3=usernumber[2];
                    s4=usernumber[3];
                    //---------------------------
                    TextView x =(TextView) findViewById(R.id.s1);
                    x.setText(new Guess().GetNumber(s1,s2,s3,s4,num1));
                } else
                {
                    TextView x =(TextView) findViewById(R.id.s1);
                    x.setText("請選擇號碼~!!!");
                }

            }else {
                TextView x =(TextView) findViewById(R.id.s1);
                x.setText("請先產生亂數~!!!");
            }
        }
    };
    private View.OnClickListener btnNumber_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            TextView x =(TextView) findViewById(R.id.s1);
            x.setText("             ");
            TextView x1 =(TextView) findViewById(R.id.s2);
            x1.setText("");
            TextView x2 =(TextView) findViewById(R.id.t5);
            x2.setText("");
            s="";
            Count1 =0;
            s5 = "";
            length1 = 0.0;


            a1=(int)(Math.random()*10); //產生1-49之間的亂數

            hs.add(a1);
            num1[0] = a1;
            s5 += String.valueOf(a1) + " ";

            for(int i=1; i < 4 ;i++){
                a1=(int)(Math.random()*9)+1;
                while(hs.contains(a1)){
                    //如果亂數值重覆~~再重新產生一個亂數
                    a1=(int)(Math.random()*9)+1;
                }//while
                hs.add(a1);
                num1[i]=a1;
                s5 += String.valueOf(a1) + " ";
            }//for i
            x9.setText("已經產生亂數!");
        }
    };

    //重新再猜一
    private View.OnClickListener btnR1_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView x =(TextView) findViewById(R.id.s1);
            x.setText("             ");
            //     TextView x1 =(TextView) findViewById(R.id.s2);
            //     x1.setText("");
            TextView x2 =(TextView) findViewById(R.id.t5);
            x2.setText("");
            s="";
            Count1 =0;
            //    s5 = "";
        }
    };

    private View.OnClickListener btnAns_click =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (s5 != "") {
                TextView x =(TextView) findViewById(R.id.s2);
                x.setText(s5);

            } else {
                TextView x =(TextView) findViewById(R.id.s2);
                x.setText("請先產生亂數~!!!");
            }


        }
    };

    private View.OnClickListener btn1_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            x9.setText("");

            length1 = (double)(x1.getText().length());
            if (length1 < 4) {
                s = "1";
                usernumber[Count1]="1";
                Count1 ++;
                x1.setText(x1.getText().toString()+s);
            } else if (length1 >= 4)  {
                TextView x =(TextView) findViewById(R.id.s1);
                x.setText("只能輸入四位數~!!!");
            }
        }
    };
    private View.OnClickListener btn2_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            x9.setText("");
            length1 = (double)(x1.getText().length());
            if (length1 < 4) {
                s = "2";
                usernumber[Count1]="2";
                Count1 ++;
                x1.setText(x1.getText().toString()+s);
            } else if (length1 >= 4) {
                TextView x =(TextView) findViewById(R.id.s1);
                x.setText("只能輸入四位數~!!!");
            }
        }
    };
    private View.OnClickListener btn3_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            x9.setText("");
            length1 = (double)(x1.getText().length());
            if (length1 < 4) {
                s = "3";
                usernumber[Count1]="3";
                Count1 ++;
                x1.setText(x1.getText().toString()+s);
            } else if (length1 >= 4) {
                TextView x =(TextView) findViewById(R.id.s1);
                x.setText("只能輸入四位數~!!!");
            }
        }
    };
    private View.OnClickListener btn4_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            x9.setText("");
            length1 = (double)(x1.getText().length());
            if (length1 <  4) {
                s = "4";
                usernumber[Count1]="4";
                Count1 ++;
                x1.setText(x1.getText().toString()+s);
            } else  if (length1 >= 4) {
                TextView x =(TextView) findViewById(R.id.s1);
                x.setText("只能輸入四位數~!!!");
            }
        }
    };
    private View.OnClickListener btn5_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            x9.setText("");
            length1 = (double)(x1.getText().length());
            if (length1 <  4) {
                s = "5";
                usernumber[Count1]="5";
                Count1 ++;
                x1.setText(x1.getText().toString()+s);
            } else  if (length1 >= 4)  {
                TextView x =(TextView) findViewById(R.id.s1);
                x.setText("只能輸入四位數~!!!");
            }
        }
    };
    private View.OnClickListener btn6_click= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            x9.setText("");
            length1 = (double)(x1.getText().length());
            if (length1 <  4) {
                s = "6";
                usernumber[Count1]="6";
                Count1 ++;
                x1.setText(x1.getText().toString()+s);
            } else  if (length1 >= 4) {
                TextView x =(TextView) findViewById(R.id.s1);
                x.setText("只能輸入四位數~!!!");
            }
        }
    };
    private View.OnClickListener btn7_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            x9.setText("");
            length1 = (double)(x1.getText().length());
            if (length1 <  4) {
                s = "7";
                usernumber[Count1]="7";
                Count1 ++;
                x1.setText(x1.getText().toString()+s);
            } else  if (length1 >= 4) {
                TextView x =(TextView) findViewById(R.id.s1);
                x.setText("只能輸入四位數~!!!");
            }
        }
    };
    private View.OnClickListener btn8_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            x9.setText("");
            length1 = (double)(x1.getText().length());
            if (length1 <  4) {
                s = "8";
                usernumber[Count1]="8";
                Count1 ++;
                x1.setText(x1.getText().toString()+s);
            } else  if (length1 >= 4) {
                TextView x =(TextView) findViewById(R.id.s1);
                x.setText("只能輸入四位數~!!!");
            }
        }
    };
    private View.OnClickListener btn9_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            x9.setText("");
            length1 = (double)(x1.getText().length());
            if (length1 <  4) {
                s = "9";
                usernumber[Count1]="9";
                Count1 ++;
                x1.setText(x1.getText().toString()+s);
            } else  if (length1 >= 4) {
                TextView x =(TextView) findViewById(R.id.s1);
                x.setText("只能輸入四位數~!!!");
            }
        }
    };
    private View.OnClickListener btn0_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            x9.setText("");
            length1 = (double)(x1.getText().length());
            if (length1 <  4) {
                s = "0";
                usernumber[Count1]="0";
                Count1 ++;
                x1.setText(x1.getText().toString()+s);
            } else  if (length1 >= 4) {
                TextView x =(TextView) findViewById(R.id.s1);
                x.setText("只能輸入四位數~!!!");
            }
        }
    };


    private void InitialComponent() {
        btnOk = (Button)super.findViewById(R.id.btnOK);
        btnOk.setOnClickListener(btnOk_click);

        btnNumber = (Button)super.findViewById(R.id.btnNumber);
        btnNumber.setOnClickListener(btnNumber_click);

        btnAns = (Button)super.findViewById(R.id.btnAns);
        btnAns.setOnClickListener(btnAns_click);

        btnR1 = (Button)super.findViewById(R.id.btnR1);
        btnR1.setOnClickListener(btnR1_click);

        btn01 = (Button)super.findViewById(R.id.btn1);
        btn01.setOnClickListener(btn1_click);

        btn02 = (Button)super.findViewById(R.id.btn2);
        btn02.setOnClickListener(btn2_click);

        btn03 = (Button)super.findViewById(R.id.btn3);
        btn03.setOnClickListener(btn3_click);

        btn04 = (Button)super.findViewById(R.id.btn4);
        btn04.setOnClickListener(btn4_click);

        btn05 = (Button)super.findViewById(R.id.btn5);
        btn05.setOnClickListener(btn5_click);

        btn06 = (Button)super.findViewById(R.id.btn6);
        btn06.setOnClickListener(btn6_click);

        btn07 = (Button)super.findViewById(R.id.btn7);
        btn07.setOnClickListener(btn7_click);

        btn08 = (Button)super.findViewById(R.id.btn8);
        btn08.setOnClickListener(btn8_click);

        btn09 = (Button)super.findViewById(R.id.btn9);
        btn09.setOnClickListener(btn9_click);

        btn00 = (Button)super.findViewById(R.id.btn0);
        btn00.setOnClickListener(btn0_click);

        x1 =(TextView) findViewById(R.id.t5);
        x9 =(TextView) findViewById(R.id.msg1);

    }
    Button btnOk;
    Button btnNumber;
    Button btnAns;
    Button btnR1;

    Button btn00;
    Button btn01;
    Button btn02;
    Button btn03;
    Button btn04;
    Button btn05;
    Button btn06;
    Button btn07;
    Button btn08;
    Button btn09;

    HashSet<Integer> hs = new HashSet<Integer>();
    int num1[] = new int[4];//亂數存放4個碼號
    String usernumber[] = new String[4];//使用者輸入存放4個碼號
    int Count1 = 0;

    Double length1 = 0.0;
    String s = "";
    String s1 = "";
    String s2 = "";
    String s3 = "";
    String s4 = "";

    String s5 = "";

    int a1=0; //存放亂數產生的值
    TextView x1;
    TextView x9;

}
