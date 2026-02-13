package C1;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import y1.C2359g;
import y1.InterfaceC2358f;

/* loaded from: classes.dex */
public final class l {
    public static C2359g a(View view, C2359g c2359g) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c2359g);
        }
        if (c2359g.f26697a.i() == 2) {
            return c2359g;
        }
        InterfaceC2358f interfaceC2358f = c2359g.f26697a;
        ClipData e2 = interfaceC2358f.e();
        int f4 = interfaceC2358f.f();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z8 = false;
        for (int i7 = 0; i7 < e2.getItemCount(); i7++) {
            ClipData.Item itemAt = e2.getItemAt(i7);
            if ((f4 & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z8) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z8 = true;
                }
            }
        }
        return null;
    }
}
