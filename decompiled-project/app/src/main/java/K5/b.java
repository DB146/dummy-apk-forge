package K5;

import android.util.Base64;
import com.google.android.gms.common.internal.G;
import h3.o;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b {
    public static final void b(StringBuilder sb2, a aVar, Object obj) {
        int i7 = aVar.f6158b;
        if (i7 == 11) {
            Class cls = aVar.f6164v;
            G.g(cls);
            sb2.append(((b) cls.cast(obj)).toString());
        } else {
            if (i7 != 7) {
                sb2.append(obj);
                return;
            }
            sb2.append("\"");
            sb2.append(M5.d.a((String) obj));
            sb2.append("\"");
        }
    }

    public static final Object zaD(a aVar, Object obj) {
        J5.a aVar2 = aVar.f6167y;
        if (aVar2 == null) {
            return obj;
        }
        String str = (String) aVar2.f5528c.get(((Integer) obj).intValue());
        return (str == null && aVar2.f5527b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(a aVar, Object obj) {
        J5.a aVar2 = aVar.f6167y;
        G.g(aVar2);
        HashMap hashMap = aVar2.f5527b;
        Integer num = (Integer) hashMap.get((String) obj);
        Integer num2 = num;
        if (num == null) {
            num2 = (Integer) hashMap.get("gms_unknown");
        }
        G.g(num2);
        int i7 = aVar.f6160d;
        String str = aVar.f6162f;
        switch (i7) {
            case 0:
                setIntegerInternal(aVar, str, num2.intValue());
                return;
            case 1:
                zaf(aVar, str, (BigInteger) num2);
                return;
            case 2:
                setLongInternal(aVar, str, ((Long) num2).longValue());
                return;
            case 3:
            default:
                throw new IllegalStateException(o.l(i7, "Unsupported type for conversion: "));
            case 4:
                zan(aVar, str, ((Double) num2).doubleValue());
                return;
            case 5:
                zab(aVar, str, (BigDecimal) num2);
                return;
            case 6:
                setBooleanInternal(aVar, str, ((Boolean) num2).booleanValue());
                return;
            case 7:
                setStringInternal(aVar, str, (String) num2);
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
                setDecodedBytesInternal(aVar, str, (byte[]) num2);
                return;
        }
    }

    public <T extends b> void addConcreteTypeArrayInternal(a aVar, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends b> void addConcreteTypeInternal(a aVar, String str, T t5) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, a> getFieldMappings();

    public Object getFieldValue(a aVar) {
        String str = aVar.f6162f;
        if (aVar.f6164v == null) {
            return getValueObject(str);
        }
        if (!(getValueObject(str) == null)) {
            throw new IllegalStateException("Concrete field shouldn't be value object: " + aVar.f6162f);
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public abstract Object getValueObject(String str);

    public boolean isFieldSet(a aVar) {
        if (aVar.f6160d != 11) {
            return isPrimitiveFieldSet(aVar.f6162f);
        }
        if (aVar.f6161e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean isPrimitiveFieldSet(String str);

    public void setBooleanInternal(a aVar, String str, boolean z8) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(a aVar, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(a aVar, String str, int i7) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(a aVar, String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(a aVar, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(a aVar, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(a aVar, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        Map<String, a> fieldMappings = getFieldMappings();
        StringBuilder sb2 = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            a aVar = fieldMappings.get(str);
            if (isFieldSet(aVar)) {
                Object zaD = zaD(aVar, getFieldValue(aVar));
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(",");
                }
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                if (zaD != null) {
                    switch (aVar.f6160d) {
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            sb2.append("\"");
                            sb2.append(Base64.encodeToString((byte[]) zaD, 0));
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            sb2.append(Base64.encodeToString((byte[]) zaD, 10));
                            sb2.append("\"");
                            break;
                        case 10:
                            M5.c.k(sb2, (HashMap) zaD);
                            break;
                        default:
                            if (aVar.f6159c) {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i7 = 0; i7 < size; i7++) {
                                    if (i7 > 0) {
                                        sb2.append(",");
                                    }
                                    Object obj = arrayList.get(i7);
                                    if (obj != null) {
                                        b(sb2, aVar, obj);
                                    }
                                }
                                sb2.append("]");
                                break;
                            } else {
                                b(sb2, aVar, zaD);
                                break;
                            }
                    }
                } else {
                    sb2.append("null");
                }
            }
        }
        if (sb2.length() > 0) {
            sb2.append("}");
        } else {
            sb2.append("{}");
        }
        return sb2.toString();
    }

    public final void zaA(a aVar, String str) {
        if (aVar.f6167y != null) {
            a(aVar, str);
        } else {
            setStringInternal(aVar, aVar.f6162f, str);
        }
    }

    public final void zaB(a aVar, Map map) {
        if (aVar.f6167y != null) {
            a(aVar, map);
        } else {
            setStringMapInternal(aVar, aVar.f6162f, map);
        }
    }

    public final void zaC(a aVar, ArrayList arrayList) {
        if (aVar.f6167y != null) {
            a(aVar, arrayList);
        } else {
            setStringsInternal(aVar, aVar.f6162f, arrayList);
        }
    }

    public final void zaa(a aVar, BigDecimal bigDecimal) {
        if (aVar.f6167y != null) {
            a(aVar, bigDecimal);
        } else {
            zab(aVar, aVar.f6162f, bigDecimal);
        }
    }

    public void zab(a aVar, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(a aVar, ArrayList arrayList) {
        if (aVar.f6167y != null) {
            a(aVar, arrayList);
        } else {
            zad(aVar, aVar.f6162f, arrayList);
        }
    }

    public void zad(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(a aVar, BigInteger bigInteger) {
        if (aVar.f6167y != null) {
            a(aVar, bigInteger);
        } else {
            zaf(aVar, aVar.f6162f, bigInteger);
        }
    }

    public void zaf(a aVar, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(a aVar, ArrayList arrayList) {
        if (aVar.f6167y != null) {
            a(aVar, arrayList);
        } else {
            zah(aVar, aVar.f6162f, arrayList);
        }
    }

    public void zah(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(a aVar, boolean z8) {
        if (aVar.f6167y != null) {
            a(aVar, Boolean.valueOf(z8));
        } else {
            setBooleanInternal(aVar, aVar.f6162f, z8);
        }
    }

    public final void zaj(a aVar, ArrayList arrayList) {
        if (aVar.f6167y != null) {
            a(aVar, arrayList);
        } else {
            zak(aVar, aVar.f6162f, arrayList);
        }
    }

    public void zak(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(a aVar, byte[] bArr) {
        if (aVar.f6167y != null) {
            a(aVar, bArr);
        } else {
            setDecodedBytesInternal(aVar, aVar.f6162f, bArr);
        }
    }

    public final void zam(a aVar, double d10) {
        if (aVar.f6167y != null) {
            a(aVar, Double.valueOf(d10));
        } else {
            zan(aVar, aVar.f6162f, d10);
        }
    }

    public void zan(a aVar, String str, double d10) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(a aVar, ArrayList arrayList) {
        if (aVar.f6167y != null) {
            a(aVar, arrayList);
        } else {
            zap(aVar, aVar.f6162f, arrayList);
        }
    }

    public void zap(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(a aVar, float f4) {
        if (aVar.f6167y != null) {
            a(aVar, Float.valueOf(f4));
        } else {
            zar(aVar, aVar.f6162f, f4);
        }
    }

    public void zar(a aVar, String str, float f4) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(a aVar, ArrayList arrayList) {
        if (aVar.f6167y != null) {
            a(aVar, arrayList);
        } else {
            zat(aVar, aVar.f6162f, arrayList);
        }
    }

    public void zat(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(a aVar, int i7) {
        if (aVar.f6167y != null) {
            a(aVar, Integer.valueOf(i7));
        } else {
            setIntegerInternal(aVar, aVar.f6162f, i7);
        }
    }

    public final void zav(a aVar, ArrayList arrayList) {
        if (aVar.f6167y != null) {
            a(aVar, arrayList);
        } else {
            zaw(aVar, aVar.f6162f, arrayList);
        }
    }

    public void zaw(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(a aVar, long j) {
        if (aVar.f6167y != null) {
            a(aVar, Long.valueOf(j));
        } else {
            setLongInternal(aVar, aVar.f6162f, j);
        }
    }

    public final void zay(a aVar, ArrayList arrayList) {
        if (aVar.f6167y != null) {
            a(aVar, arrayList);
        } else {
            zaz(aVar, aVar.f6162f, arrayList);
        }
    }

    public void zaz(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
