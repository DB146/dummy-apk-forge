package g3;

import android.os.Build;

/* renamed from: g3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1183b extends AbstractC1184c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17433d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1183b(int i7, String str, String str2) {
        super(str, str2);
        this.f17433d = i7;
    }

    @Override // g3.AbstractC1184c
    public final boolean a() {
        switch (this.f17433d) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return Build.VERSION.SDK_INT >= 26;
            case 4:
                return Build.VERSION.SDK_INT >= 27;
            case 5:
                return Build.VERSION.SDK_INT >= 28;
            default:
                return Build.VERSION.SDK_INT >= 29;
        }
    }
}
