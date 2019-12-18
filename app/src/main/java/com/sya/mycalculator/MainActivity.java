package com.sya.mycalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    TextView etAnswer;
    TextView etExpresion;

    String numberOne="",numberTwo="";

    Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven,
            buttonEight, buttonNine, buttonZero, buttonDot, buttonClear, buttonEqual, buttonPlus, buttonSub,
            buttonDiv, buttonMul, buttonPercentage,buttonExit;


    boolean addOperation;
    boolean subOperation;
    boolean mulOperation;
    boolean divOperation;
    boolean mRemainder;
    boolean decimal;

    double mValueone = 0, mValuetwo = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


        etAnswer = findViewById ( R.id.etOne );
        etExpresion = findViewById ( R.id.etTwo );
        buttonOne = findViewById ( R.id.one );
        buttonTwo = findViewById ( R.id.two );
        buttonThree = findViewById ( R.id.three );
        buttonFour = findViewById ( R.id.four );
        buttonFive = findViewById ( R.id.five );
        buttonSix = findViewById ( R.id.six );
        buttonSeven = findViewById ( R.id.seven );
        buttonEight = findViewById ( R.id.eight );
        buttonNine = findViewById ( R.id.nine );
        buttonZero = findViewById ( R.id.zero );
        buttonDot = findViewById ( R.id.dot );
        buttonPlus = findViewById ( R.id.plus );
        buttonSub = findViewById ( R.id.sub );
        buttonMul = findViewById ( R.id.mul );
        buttonDiv = findViewById ( R.id.div );


        buttonEqual = findViewById ( R.id.equal );
        buttonClear = findViewById ( R.id.clear );
        buttonExit  = findViewById ( R.id.buttonExit );
        buttonPercentage = (Button) findViewById ( R.id.percentage );



        buttonExit.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(R.string.app_name);
                builder.setIcon(R.mipmap.calcaa);
                builder.setMessage("Do you want to exit?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                System.exit ( 0 );
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();

            }
        } );

        buttonOne.setOnClickListener ( new View.OnClickListener ( ) {
                @Override
                public void onClick(View v) {

                    numberOne = numberOne + "1";
                    numberTwo = numberTwo + "1";

                    etAnswer.setText ( numberOne);
                    etExpresion.setText ( numberTwo );
                }
            } );


        buttonTwo.setOnClickListener ( new View.OnClickListener ( ) {
                @Override
                public void onClick(View v) {


                    numberOne = numberOne + "2";
                    numberTwo = numberTwo + "2";

                    etAnswer.setText ( numberOne);
                    etExpresion.setText ( numberTwo );
                }
            } );


        buttonThree.setOnClickListener ( new View.OnClickListener ( ) {
                @Override
                public void onClick(View v) {

                    numberOne = numberOne + "3";
                    numberTwo = numberTwo + "3";

                    etAnswer.setText ( numberOne);
                    etExpresion.setText ( numberTwo );
                }
            } );


            buttonFour.setOnClickListener ( new View.OnClickListener ( ) {
                @Override
                public void onClick(View v) {

                    numberOne = numberOne + "4";
                    numberTwo = numberTwo + "4";

                    etAnswer.setText ( numberOne);
                    etExpresion.setText ( numberTwo );
                }
            } );


        buttonFive.setOnClickListener ( new View.OnClickListener ( ) {
                @Override
                public void onClick(View v) {
                    numberOne = numberOne + "5";
                    numberTwo = numberTwo + "5";

                    etAnswer.setText ( numberOne);
                    etExpresion.setText ( numberTwo );

                }
            } );


        buttonSix.setOnClickListener ( new View.OnClickListener ( ) {
                @Override
                public void onClick(View v) {

                    numberOne = numberOne + "6";
                    numberTwo = numberTwo + "6";

                    etAnswer.setText ( numberOne);
                    etExpresion.setText ( numberTwo );
                }
            } );


            buttonSeven.setOnClickListener ( new View.OnClickListener ( ) {
                @Override
                public void onClick(View v) {

                    numberOne = numberOne + "7";
                    numberTwo = numberTwo + "7";

                    etAnswer.setText ( numberOne);
                    etExpresion.setText ( numberTwo );
                }
            } );
        buttonEight.setOnClickListener ( new View.OnClickListener ( ) {
                @Override
                public void onClick(View v) {
                    numberOne = numberOne + "8";
                    numberTwo = numberTwo + "8";

                    etAnswer.setText ( numberOne);
                    etExpresion.setText ( numberTwo );
               }
            } );


        buttonNine.setOnClickListener ( new View.OnClickListener ( ) {
                @Override
                public void onClick(View v) {

                    numberOne = numberOne + "9";
                    numberTwo = numberTwo + "9";

                    etAnswer.setText ( numberOne);
                    etExpresion.setText ( numberTwo );
                }
            } );


        buttonZero.setOnClickListener ( new View.OnClickListener ( ) {
                @Override
                public void onClick(View v) {

                    numberOne = numberOne + "0";
                    numberTwo = numberTwo + "0";

                    etAnswer.setText ( numberOne);
                    etExpresion.setText ( numberTwo );
                }
            } );




        buttonPlus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {

                if (etAnswer.getText ( ).length ( ) != 0) {
                    mValueone = Float.parseFloat ( etAnswer.getText ( ) + "" );
                    addOperation = true;
                    decimal = false;

                    numberOne = "";
                    numberTwo = numberTwo+"+";

                    etAnswer.setText ( null );
                    etExpresion.setText ( numberTwo);
                }
            }
        } );


        buttonSub.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                if (etAnswer.getText ( ).length ( ) != 0) {
                    mValueone = Float.parseFloat ( numberOne + "" );
                    subOperation = true;
                    decimal = false;

                    numberOne = "";
                    numberTwo = numberTwo+"-";

                    etAnswer.setText ( null );
                    etExpresion.setText ( numberTwo);
                }
            }
        } );


        buttonMul.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                if (etAnswer.getText ( ).length ( ) != 0) {
                    mValueone = Float.parseFloat ( numberOne + "" );
                    mulOperation = true;
                    decimal = false;

                    numberOne = "";
                    numberTwo = numberTwo+"X";

                    etAnswer.setText ( null );
                    etExpresion.setText ( numberTwo );
                }

            }
        } );


        buttonDiv.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                if (etAnswer.getText ( ).length ( ) != 0) {
                    mValueone = Float.parseFloat ( numberOne + "" );
                    divOperation = true;
                    decimal = false;

                    numberOne = "";
                    numberTwo = numberTwo+"/";

                    etAnswer.setText ( null );
                    etExpresion.setText ( numberTwo );
                }
            }
        } );

        buttonPercentage.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                if (etAnswer.getText ( ).length ( ) != 0) {
                    mValueone = Float.parseFloat ( numberOne + "" );
                    mRemainder = true;
                    decimal = false;

                    numberOne = "";
                    numberTwo = numberTwo+"%";

                    etAnswer.setText ( null );
                    etExpresion.setText ( numberTwo  );
                }
            }
        } );

        buttonEqual.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {



                    if (addOperation || subOperation || mulOperation || divOperation || mRemainder) {
                        mValuetwo = Float.parseFloat ( numberOne + "" );
                    }

                    if (addOperation) {


                        double k = mValueone + mValuetwo;
                        DecimalFormat df = new DecimalFormat ( "###.###" );
                        etAnswer.setText ( df.format ( k ) );
                        addOperation = false;


                    }


                    if (subOperation) {

                        double k = mValueone - mValuetwo;
                        DecimalFormat df = new DecimalFormat ( "###.###" );
                        etAnswer.setText ( df.format ( k ) );
                        subOperation = false;

                    }


                    if (mulOperation) {

                        double k = mValueone * mValuetwo;
                        DecimalFormat df = new DecimalFormat ( "###.###" );
                        etAnswer.setText ( df.format ( k ) );
                        mulOperation = false;

                    }


                    if (divOperation) {

                        double k = mValueone / mValuetwo;
                        DecimalFormat df = new DecimalFormat ( "###.###" );
                        etAnswer.setText ( df.format ( k ) );
                        divOperation = false;

                    }


                    if (mRemainder) {


                        double k = (mValueone / mValuetwo) * 100;
                        DecimalFormat df = new DecimalFormat ( "###.###" );
                        etAnswer.setText ( df.format ( k ) );
                        mRemainder = false;


                    }


                    numberTwo = "";
                    numberOne = "";




            }
        } );

        buttonClear.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                etAnswer.setText ( "" );
                mValueone = 0;
                mValuetwo = 0;
                numberTwo = "";
                numberOne = "";
                etExpresion.setText ( "" );
            }
        } );


        buttonDot.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {

                    numberOne = numberOne+".";
                    numberTwo = numberTwo+".";
                    decimal = true;
                etAnswer.setText ( numberOne);
                etExpresion.setText ( numberTwo );



            }
        } );


    }

}