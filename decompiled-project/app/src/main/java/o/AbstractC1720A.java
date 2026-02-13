package o;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import y1.C2355c;
import y1.C2357e;
import y1.InterfaceC2356d;

/* renamed from: o.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1720A {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC2356d interfaceC2356d;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC2356d = new C2355c(clipData, 3);
            } else {
                C2357e c2357e = new C2357e();
                c2357e.f26690b = clipData;
                c2357e.f26691c = 3;
                interfaceC2356d = c2357e;
            }
            y1.K.j(textView, interfaceC2356d.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC2356d interfaceC2356d;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC2356d = new C2355c(clipData, 3);
        } else {
            C2357e c2357e = new C2357e();
            c2357e.f26690b = clipData;
            c2357e.f26691c = 3;
            interfaceC2356d = c2357e;
        }
        y1.K.j(view, interfaceC2356d.build());
        return true;
    }
}
