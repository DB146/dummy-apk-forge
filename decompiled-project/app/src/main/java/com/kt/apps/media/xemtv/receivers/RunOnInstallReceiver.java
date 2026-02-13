package com.kt.apps.media.xemtv.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Set;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class RunOnInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Set<String> keySet;
        l.e(context, "context");
        l.e(intent, "intent");
        intent.getAction();
        Bundle extras = intent.getExtras();
        if (extras != null && (keySet = extras.keySet()) != null) {
            for (String str : keySet) {
                Bundle extras2 = intent.getExtras();
                String message = str + " - " + (extras2 != null ? extras2.get(str) : null);
                l.e(message, "message");
            }
        }
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -489371415:
                    action.equals("android.media.tv.action.INITIALIZE_PROGRAMS");
                    return;
                case -160295064:
                    if (!action.equals("android.media.tv.action.WATCH_NEXT_PROGRAM_BROWSABLE_DISABLED")) {
                        return;
                    }
                    break;
                case 1568780589:
                    if (!action.equals("android.media.tv.action.PREVIEW_PROGRAM_BROWSABLE_DISABLED")) {
                        return;
                    }
                    break;
                case 2011523553:
                    if (!action.equals("android.media.tv.action.PREVIEW_PROGRAM_ADDED_TO_WATCH_NEXT")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            Bundle extras3 = intent.getExtras();
            String message2 = "User added program " + (extras3 != null ? Long.valueOf(extras3.getLong("android.media.tv.extra.PREVIEW_PROGRAM_ID")) : null) + " to watch next";
            l.e(message2, "message");
        }
    }
}
