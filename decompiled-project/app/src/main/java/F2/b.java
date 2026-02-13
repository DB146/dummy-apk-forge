package F2;

import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import t8.C2034c;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C2034c f4037a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4038b;

    /* renamed from: c, reason: collision with root package name */
    public final File f4039c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4040d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4041e = false;

    /* renamed from: f, reason: collision with root package name */
    public X4.e[] f4042f;
    public byte[] g;

    public b(AssetManager assetManager, E2.d dVar, C2034c c2034c, String str, File file) {
        byte[] bArr;
        this.f4037a = c2034c;
        this.f4040d = str;
        this.f4039c = file;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 31) {
            switch (i7) {
                case 24:
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    bArr = c.g;
                    break;
                case 26:
                    bArr = c.f4048f;
                    break;
                case 27:
                    bArr = c.f4047e;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = c.f4046d;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = c.f4045c;
        }
        this.f4038b = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
            }
            return null;
        }
    }

    public final void b(int i7, Serializable serializable) {
        new a(this, i7, serializable, 0).run();
    }
}
