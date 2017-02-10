package bsru.yugade.bsrufriend;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by yugade on 10/2/2560.
 */

public class MyAlert {

    //explicit
    private Context context;

    public MyAlert(Context context) {
        this.context = context;
    }   //constructor

    public void myDialog(String strTitle, String strMessage) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.doremon48);
        builder.setTitle(strTitle);
        builder.setMessage(strMessage);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                           }
                    });
                builder.show();


    }   //myDialog

}   //Main Class
