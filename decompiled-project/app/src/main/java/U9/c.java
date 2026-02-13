package U9;

import com.kt.apps.core.extensions.ExtensionsChannel;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f9853c;

    public /* synthetic */ c(String str, d dVar, int i7) {
        this.f9851a = i7;
        this.f9852b = str;
        this.f9853c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [M9.b] */
    @Override // Rb.c
    public final Object invoke(Object obj) {
        T2.c R10;
        LinkedHashMap b2;
        switch (this.f9851a) {
            case 0:
                String str = this.f9852b;
                T2.a _connection = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection, "_connection");
                R10 = _connection.R("SELECT * FROM ExtensionChannelDatabaseViews INNER JOIN ExtensionsConfig ON extensionSourceId=sourceUrl WHERE tvStreamLink=? ");
                try {
                    R10.y(1, str);
                    int h10 = P2.j.h(R10, "tvGroup");
                    int h11 = P2.j.h(R10, "logoChannel");
                    int h12 = P2.j.h(R10, "tvChannelName");
                    int h13 = P2.j.h(R10, "tvStreamLink");
                    int h14 = P2.j.h(R10, "sourceFrom");
                    int h15 = P2.j.h(R10, "channelId");
                    int h16 = P2.j.h(R10, "channelPreviewProviderId");
                    int h17 = P2.j.h(R10, "isHls");
                    int h18 = P2.j.h(R10, "catchupSource");
                    int h19 = P2.j.h(R10, "userAgent");
                    int h20 = P2.j.h(R10, "referer");
                    int h21 = P2.j.h(R10, "props");
                    int h22 = P2.j.h(R10, "extensionSourceId");
                    int h23 = P2.j.h(R10, "sourceName");
                    int h24 = P2.j.h(R10, "sourceUrl");
                    int h25 = P2.j.h(R10, "type");
                    LinkedHashMap linkedHashMap = null;
                    if (R10.J()) {
                        String j = R10.j(h10);
                        String j10 = R10.j(h11);
                        String j11 = R10.j(h12);
                        String j12 = R10.j(h13);
                        String j13 = R10.j(h14);
                        String j14 = R10.j(h15);
                        long x2 = R10.x(h16);
                        boolean z8 = ((int) R10.x(h17)) != 0;
                        String j15 = R10.j(h18);
                        String j16 = R10.j(h19);
                        String j17 = R10.j(h20);
                        String j18 = R10.E(h21) ? null : R10.j(h21);
                        d dVar = this.f9853c;
                        if (j18 != null) {
                            dVar.f9856c.getClass();
                            linkedHashMap = T9.a.b(j18);
                        }
                        ExtensionsChannel extensionsChannel = new ExtensionsChannel(j, j10, j11, j12, j13, j14, x2, z8, j15, j16, j17, linkedHashMap, R10.j(h22));
                        String j19 = R10.j(h23);
                        String j20 = R10.j(h24);
                        String j21 = R10.j(h25);
                        dVar.f9856c.getClass();
                        linkedHashMap = new M9.b(extensionsChannel, new M9.d(j19, j20, T9.a.a(j21)));
                    }
                    return linkedHashMap;
                } finally {
                }
            default:
                String str2 = this.f9852b;
                d dVar2 = this.f9853c;
                T2.a _connection2 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection2, "_connection");
                R10 = _connection2.R("SELECT * FROM ExtensionChannelDatabaseViews WHERE extensionSourceId=? ");
                try {
                    R10.y(1, str2);
                    int h26 = P2.j.h(R10, "tvGroup");
                    int h27 = P2.j.h(R10, "logoChannel");
                    int h28 = P2.j.h(R10, "tvChannelName");
                    int h29 = P2.j.h(R10, "tvStreamLink");
                    int h30 = P2.j.h(R10, "sourceFrom");
                    int h31 = P2.j.h(R10, "channelId");
                    int h32 = P2.j.h(R10, "channelPreviewProviderId");
                    int h33 = P2.j.h(R10, "isHls");
                    int h34 = P2.j.h(R10, "catchupSource");
                    int h35 = P2.j.h(R10, "userAgent");
                    int h36 = P2.j.h(R10, "referer");
                    int h37 = P2.j.h(R10, "props");
                    int h38 = P2.j.h(R10, "extensionSourceId");
                    ArrayList arrayList = new ArrayList();
                    while (R10.J()) {
                        String j22 = R10.j(h26);
                        String j23 = R10.j(h27);
                        String j24 = R10.j(h28);
                        String j25 = R10.j(h29);
                        String j26 = R10.j(h30);
                        String j27 = R10.j(h31);
                        long x10 = R10.x(h32);
                        int i7 = h27;
                        int i10 = h28;
                        boolean z10 = ((int) R10.x(h33)) != 0;
                        String j28 = R10.j(h34);
                        String j29 = R10.j(h35);
                        String j30 = R10.j(h36);
                        String j31 = R10.E(h37) ? null : R10.j(h37);
                        if (j31 == null) {
                            b2 = null;
                        } else {
                            dVar2.f9856c.getClass();
                            b2 = T9.a.b(j31);
                        }
                        arrayList.add(new ExtensionsChannel(j22, j23, j24, j25, j26, j27, x10, z10, j28, j29, j30, b2, R10.j(h38)));
                        h27 = i7;
                        h28 = i10;
                    }
                    return arrayList;
                } finally {
                }
        }
    }
}
