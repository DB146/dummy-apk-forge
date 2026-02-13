package Z4;

import P4.o0;
import android.util.Pair;
import java.util.LinkedList;
import m4.C1586o0;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f12172a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12173b;

    /* renamed from: c, reason: collision with root package name */
    public final d f12174c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedList f12175d = new LinkedList();

    public d(d dVar, String str, String str2) {
        this.f12174c = dVar;
        this.f12172a = str;
        this.f12173b = str2;
    }

    public static int g(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e2) {
            throw C1586o0.b(null, e2);
        }
    }

    public static long h(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e2) {
            throw C1586o0.b(null, e2);
        }
    }

    public static int i(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new o0(str, 1);
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e2) {
            throw C1586o0.b(null, e2);
        }
    }

    public void a(Object obj) {
    }

    public abstract Object b();

    public final Object c(String str) {
        int i7 = 0;
        while (true) {
            LinkedList linkedList = this.f12175d;
            if (i7 >= linkedList.size()) {
                d dVar = this.f12174c;
                if (dVar == null) {
                    return null;
                }
                return dVar.c(str);
            }
            Pair pair = (Pair) linkedList.get(i7);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
            i7++;
        }
    }

    public boolean d(String str) {
        return false;
    }

    public final Object e(XmlPullParser xmlPullParser) {
        boolean z8 = false;
        int i7 = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            d dVar = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (this.f12173b.equals(name)) {
                    j(xmlPullParser);
                    z8 = true;
                } else if (z8) {
                    if (i7 > 0) {
                        i7++;
                    } else if (d(name)) {
                        j(xmlPullParser);
                    } else {
                        boolean equals = "QualityLevel".equals(name);
                        String str = this.f12172a;
                        if (equals) {
                            dVar = new d(this, str, "QualityLevel");
                        } else if ("Protection".equals(name)) {
                            dVar = new d(this, str, "Protection");
                        } else if ("StreamIndex".equals(name)) {
                            dVar = new h(this, str);
                        }
                        if (dVar == null) {
                            i7 = 1;
                        } else {
                            a(dVar.e(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z8 && i7 == 0) {
                    k(xmlPullParser);
                }
            } else if (!z8) {
                continue;
            } else if (i7 > 0) {
                i7--;
            } else {
                String name2 = xmlPullParser.getName();
                f(xmlPullParser);
                if (!d(name2)) {
                    return b();
                }
            }
            xmlPullParser.next();
        }
    }

    public void f(XmlPullParser xmlPullParser) {
    }

    public abstract void j(XmlPullParser xmlPullParser);

    public void k(XmlPullParser xmlPullParser) {
    }

    public final void l(Object obj, String str) {
        this.f12175d.add(Pair.create(str, obj));
    }
}
