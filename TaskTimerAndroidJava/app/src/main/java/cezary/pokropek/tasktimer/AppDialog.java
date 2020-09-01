package cezary.pokropek.tasktimer;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class AppDialog extends DialogFragment {
    public static final String TAG = "AppDialog";

    /**
     * The dialogue's callback interface to notify of user selected results (deletions confirmaed, etc.).
     */
    interface DialogEvents {
        void onPositiveDialogResult(int dialogId, Bundle args);
        void onNegativeDialogResult(int dialogId, Bundle args);
        void onDialogCancelled(int dialogId);
    }


}
