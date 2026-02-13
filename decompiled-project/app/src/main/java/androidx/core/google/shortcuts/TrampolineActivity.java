package androidx.core.google.shortcuts;

import P4.C0463k;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.bumptech.glide.c;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public class TrampolineActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0463k f13274a;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (f13274a == null) {
            f13274a = c.D(this);
        }
        if (f13274a != null) {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("shortcutUrl");
            String stringExtra2 = intent.getStringExtra("shortcutTag");
            if (stringExtra != null && stringExtra2 != null) {
                try {
                    f13274a.p().a(Base64.decode(stringExtra2, 0), stringExtra.getBytes(Charset.forName("UTF-8")));
                    startActivity(Intent.parseUri(stringExtra, 1));
                } catch (URISyntaxException | GeneralSecurityException e2) {
                    Log.w("TrampolineActivity", "failed to open shortcut url", e2);
                }
            }
        }
        finish();
    }
}
