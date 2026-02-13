package U9;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9850b;

    public /* synthetic */ b(String str, int i7) {
        this.f9849a = i7;
        this.f9850b = str;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        T2.c R10;
        switch (this.f9849a) {
            case 0:
                String str = this.f9850b;
                T2.a _connection = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection, "_connection");
                R10 = _connection.R("DELETE FROM ExtensionsChannel WHERE extensionSourceId=?");
                try {
                    R10.y(1, str);
                    R10.J();
                    R10.close();
                    return Db.q.f3365a;
                } finally {
                }
            case 1:
                String str2 = this.f9850b;
                T2.a _connection2 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection2, "_connection");
                R10 = _connection2.R("SELECT COUNT(*) FROM ExtensionsConfig WHERE sourceUrl = ?");
                try {
                    R10.y(1, str2);
                    Integer num = null;
                    if (R10.J() && !R10.E(0)) {
                        num = Integer.valueOf((int) R10.x(0));
                    }
                    return num;
                } finally {
                }
            case 2:
                String str3 = this.f9850b;
                T2.a _connection3 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection3, "_connection");
                R10 = _connection3.R("SELECT * FROM MapChannel WHERE channelName LIKE ?||'%'");
                try {
                    R10.y(1, str3);
                    int h10 = P2.j.h(R10, "channelId");
                    int h11 = P2.j.h(R10, "channelName");
                    int h12 = P2.j.h(R10, "fromSource");
                    int h13 = P2.j.h(R10, "channelGroup");
                    ArrayList arrayList = new ArrayList();
                    while (R10.J()) {
                        arrayList.add(new W9.d(R10.j(h10), R10.j(h11), R10.j(h12), R10.j(h13)));
                    }
                    return arrayList;
                } finally {
                }
            case 3:
                String str4 = this.f9850b;
                T2.a _connection4 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection4, "_connection");
                R10 = _connection4.R("Delete from programme where extensionEpgUrl=?");
                try {
                    R10.y(1, str4);
                    R10.J();
                    R10.close();
                    return Db.q.f3365a;
                } finally {
                }
            case 4:
                String str5 = this.f9850b;
                T2.a _connection5 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection5, "_connection");
                R10 = _connection5.R("SELECT * FROM programme WHERE channel=?");
                try {
                    R10.y(1, str5);
                    int h14 = P2.j.h(R10, "channel");
                    int h15 = P2.j.h(R10, "channelNumber");
                    int h16 = P2.j.h(R10, "start");
                    int h17 = P2.j.h(R10, "stop");
                    int h18 = P2.j.h(R10, "title");
                    int h19 = P2.j.h(R10, "description");
                    int h20 = P2.j.h(R10, "extensionsConfigId");
                    int h21 = P2.j.h(R10, "extensionEpgUrl");
                    ArrayList arrayList2 = new ArrayList();
                    while (R10.J()) {
                        arrayList2.add(new N9.a(R10.j(h14), R10.j(h15), R10.j(h16), R10.j(h17), R10.j(h18), R10.j(h19), R10.j(h20), R10.j(h21)));
                    }
                    return arrayList2;
                } finally {
                }
            case 5:
                String str6 = this.f9850b;
                T2.a _connection6 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection6, "_connection");
                R10 = _connection6.R("SELECT * FROM programme WHERE channel LIKE '%' ||? || '%'");
                try {
                    R10.y(1, str6);
                    int h22 = P2.j.h(R10, "channel");
                    int h23 = P2.j.h(R10, "channelNumber");
                    int h24 = P2.j.h(R10, "start");
                    int h25 = P2.j.h(R10, "stop");
                    int h26 = P2.j.h(R10, "title");
                    int h27 = P2.j.h(R10, "description");
                    int h28 = P2.j.h(R10, "extensionsConfigId");
                    int h29 = P2.j.h(R10, "extensionEpgUrl");
                    ArrayList arrayList3 = new ArrayList();
                    while (R10.J()) {
                        arrayList3.add(new N9.a(R10.j(h22), R10.j(h23), R10.j(h24), R10.j(h25), R10.j(h26), R10.j(h27), R10.j(h28), R10.j(h29)));
                    }
                    return arrayList3;
                } finally {
                }
            case 6:
                String str7 = this.f9850b;
                T2.a _connection7 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection7, "_connection");
                R10 = _connection7.R("SELECT * FROM tvscheduler WHERE extensionsConfigId=?");
                try {
                    R10.y(1, str7);
                    int h30 = P2.j.h(R10, "date");
                    int h31 = P2.j.h(R10, "sourceInfoName");
                    int h32 = P2.j.h(R10, "generatorInfoName");
                    int h33 = P2.j.h(R10, "generatorInfoUrl");
                    int h34 = P2.j.h(R10, "extensionsConfigId");
                    int h35 = P2.j.h(R10, "epgUrl");
                    ArrayList arrayList4 = new ArrayList();
                    while (R10.J()) {
                        arrayList4.add(new N9.b(R10.j(h30), R10.j(h31), R10.j(h32), R10.j(h33), R10.j(h34), R10.j(h35)));
                    }
                    return arrayList4;
                } finally {
                }
            case 7:
                String str8 = this.f9850b;
                T2.a _connection8 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection8, "_connection");
                R10 = _connection8.R("DELETE FROM VideoFavoriteDTO WHERE sourceFrom=?");
                try {
                    R10.y(1, str8);
                    R10.J();
                    R10.close();
                    return Db.q.f3365a;
                } finally {
                }
            default:
                String it = (String) obj;
                kotlin.jvm.internal.l.e(it, "it");
                boolean h02 = ac.g.h0(it);
                String str9 = this.f9850b;
                return h02 ? it.length() < str9.length() ? str9 : it : X.c.h(str9, it);
        }
    }
}
