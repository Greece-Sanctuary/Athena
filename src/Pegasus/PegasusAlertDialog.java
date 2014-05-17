package Pegasus;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

public class PegasusAlertDialog {

	public static void ShowAlertDialog(Context context, String title,
			String message) {
		ShowAlertDialog(context, title, message, "OK", new OnClickListener() {

			@Override
			public void onClick(DialogInterface arg0, int arg1) {

			}
		}, "", null);
	}

	public static void ShowAlertDialog(Context context, String title,
			String message, String Propmt,
			DialogInterface.OnClickListener listener) {
		
		ShowAlertDialog(context, title, message, Propmt, listener, "", null);
		
	}

	public static void ShowAlertDialog(Context context, String title,
			String message, String Positive,
			DialogInterface.OnClickListener positivelistener, String Negative,
			DialogInterface.OnClickListener negativelistener) {
		AlertDialog.Builder alertdlg = new AlertDialog.Builder(context);
		alertdlg.setTitle(title).setMessage(message);
		if (!Positive.equals("") && positivelistener != null)
			alertdlg.setPositiveButton(Positive, positivelistener).show();
		if (!Negative.equals("") && negativelistener != null)
			alertdlg.setPositiveButton(Negative, negativelistener).show();
	}

}
