package ia;

import android.content.Context;
import com.kt.apps.core.storage.local.RoomDataBase;
import q3.f;

/* renamed from: ia.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1355a implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f18479b;

    public /* synthetic */ C1355a(Context context, int i7) {
        this.f18478a = i7;
        this.f18479b = context;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f18478a) {
            case 0:
                return RoomDataBase.f16124l.g(this.f18479b);
            default:
                return f.j(this.f18479b);
        }
    }
}
