package h7;

import android.content.Context;
import j8.InterfaceC1387b;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC1387b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f17855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17856c;

    public /* synthetic */ h(int i7, Context context, String str) {
        this.f17854a = i7;
        this.f17855b = context;
        this.f17856c = str;
    }

    @Override // j8.InterfaceC1387b
    public final Object get() {
        switch (this.f17854a) {
            case 0:
                return this.f17855b.getSharedPreferences(this.f17856c, 0);
            default:
                return new h8.h(this.f17855b, this.f17856c);
        }
    }
}
