package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C0967h;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.base.zau;
import y.S;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14888b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f14889a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f14889a = 0;
            setResult(i10, intent);
            if (booleanExtra) {
                C0967h g = C0967h.g(this);
                if (i10 == -1) {
                    zau zauVar = g.f14987B;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                } else if (i10 == 0) {
                    g.h(new F5.b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i7 == 2) {
            this.f14889a = 0;
            setResult(i10, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f14889a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f14889a = bundle.getInt("resolution");
        }
        if (this.f14889a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent == null) {
                G.g(num);
                F5.e.f4098d.e(this, num.intValue(), this);
                this.f14889a = 1;
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f14889a = 1;
            } catch (ActivityNotFoundException e2) {
                if (extras.getBoolean("notify_manager", true)) {
                    C0967h.g(this).h(new F5.b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String b2 = S.b("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        b2 = b2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", b2, e2);
                }
                this.f14889a = 1;
                finish();
            } catch (IntentSender.SendIntentException e10) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e10);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f14889a);
        super.onSaveInstanceState(bundle);
    }
}
