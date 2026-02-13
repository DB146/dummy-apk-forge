package G3;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* loaded from: classes.dex */
public final class B implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4283a;

    /* renamed from: b, reason: collision with root package name */
    public final s f4284b;

    public /* synthetic */ B(s sVar, int i7) {
        this.f4283a = i7;
        this.f4284b = sVar;
    }

    @Override // G3.s
    public final r a(Object obj, int i7, int i10, A3.l lVar) {
        Uri fromFile;
        switch (this.f4283a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    fromFile = null;
                } else if (str.charAt(0) == '/') {
                    fromFile = Uri.fromFile(new File(str));
                } else {
                    Uri parse = Uri.parse(str);
                    fromFile = parse.getScheme() == null ? Uri.fromFile(new File(str)) : parse;
                }
                if (fromFile == null) {
                    return null;
                }
                s sVar = this.f4284b;
                if (sVar.b(fromFile)) {
                    return sVar.a(fromFile, i7, i10, lVar);
                }
                return null;
            default:
                return this.f4284b.a(new i((URL) obj), i7, i10, lVar);
        }
    }

    @Override // G3.s
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        switch (this.f4283a) {
            case 0:
                return true;
            default:
                return true;
        }
    }
}
