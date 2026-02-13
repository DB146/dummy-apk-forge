package Z9;

import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelUrlType;
import com.kt.apps.core.tv.model.TVChannel;
import java.util.ArrayList;
import jb.InterfaceC1394e;

/* loaded from: classes2.dex */
public final class q implements InterfaceC1394e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f12294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TVChannel f12295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f12296c;

    public q(s sVar, TVChannel tVChannel, ArrayList arrayList) {
        this.f12294a = sVar;
        this.f12295b = tVChannel;
        this.f12296c = arrayList;
    }

    @Override // jb.InterfaceC1394e
    public final Object apply(Object obj) {
        TVChannel.Url it = (TVChannel.Url) obj;
        kotlin.jvm.internal.l.e(it, "it");
        boolean a9 = kotlin.jvm.internal.l.a(it.getType(), MainTVDataSource$TVChannelUrlType.WEB_PAGE.getValue());
        TVChannel tVChannel = this.f12295b;
        s sVar = this.f12294a;
        if (a9) {
            return s.d(sVar, it, tVChannel);
        }
        ArrayList arrayList = this.f12296c;
        sVar.getClass();
        return gb.i.l(s.f(arrayList, tVChannel));
    }
}
