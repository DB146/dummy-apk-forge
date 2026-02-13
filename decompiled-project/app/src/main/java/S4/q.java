package S4;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
import m5.C1620q;
import n5.D;

/* loaded from: classes.dex */
public final class q implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C1620q f9162a;

    /* renamed from: b, reason: collision with root package name */
    public final f f9163b;

    /* renamed from: f, reason: collision with root package name */
    public T4.c f9167f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9168u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9169v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9170w;

    /* renamed from: e, reason: collision with root package name */
    public final TreeMap f9166e = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f9165d = D.m(this);

    /* renamed from: c, reason: collision with root package name */
    public final G4.b f9164c = new G4.b(1);

    public q(T4.c cVar, f fVar, C1620q c1620q) {
        this.f9167f = cVar;
        this.f9163b = fVar;
        this.f9162a = c1620q;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f9170w) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        o oVar = (o) message.obj;
        long j = oVar.f9155a;
        TreeMap treeMap = this.f9166e;
        long j10 = oVar.f9156b;
        Long l10 = (Long) treeMap.get(Long.valueOf(j10));
        if (l10 == null) {
            treeMap.put(Long.valueOf(j10), Long.valueOf(j));
        } else if (l10.longValue() > j) {
            treeMap.put(Long.valueOf(j10), Long.valueOf(j));
        }
        return true;
    }
}
