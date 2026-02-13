package kotlin.jvm.internal;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class y {
    public static Map a(Object obj) {
        if ((obj instanceof Sb.a) && !(obj instanceof Sb.d)) {
            f(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            l.i(e2, y.class.getName());
            throw e2;
        }
    }

    public static void b(int i7, Object obj) {
        if (obj == null || d(i7, obj)) {
            return;
        }
        f(obj, "kotlin.jvm.functions.Function" + i7);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return "kotlin.Double";
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0211, code lost:
    
        if (r9.equals("java.lang.Long") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:?, code lost:
    
        return "kotlin.Long";
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x022c, code lost:
    
        if (r9.equals("java.lang.Byte") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        return "kotlin.Byte";
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0239, code lost:
    
        if (r9.equals("java.lang.Boolean") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
    
        return "kotlin.Boolean";
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0254, code lost:
    
        if (r9.equals("java.lang.Character") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:?, code lost:
    
        return "kotlin.Char";
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0261, code lost:
    
        if (r9.equals("short") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:?, code lost:
    
        return "kotlin.Short";
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x026e, code lost:
    
        if (r9.equals("float") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:?, code lost:
    
        return "kotlin.Float";
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0297, code lost:
    
        if (r9.equals("boolean") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02a1, code lost:
    
        if (r9.equals("long") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02ab, code lost:
    
        if (r9.equals("char") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02b5, code lost:
    
        if (r9.equals("byte") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02f3, code lost:
    
        if (r9.equals("java.lang.Short") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02fd, code lost:
    
        if (r9.equals("java.lang.Float") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x032f, code lost:
    
        if (r9.equals("double") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cc, code lost:
    
        if (r9.equals("java.lang.Double") == false) goto L261;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0014. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:37:0x037f A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                break;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                break;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                break;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                break;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                break;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                break;
            case -1325958191:
                break;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                break;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                break;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                break;
            case -527879800:
                break;
            case -515992664:
                break;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                break;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                break;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                break;
            case 3039496:
                break;
            case 3052374:
                break;
            case 3327612:
                break;
            case 64711720:
                break;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                break;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                break;
            case 97526364:
                break;
            case 109413500:
                break;
            case 155276373:
                break;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                break;
            case 344809556:
                break;
            case 398507100:
                break;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                break;
            case 398795216:
                break;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                break;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                break;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                break;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                break;
            case 761287205:
                break;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                break;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                break;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                break;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                break;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                break;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                break;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                break;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        break;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        break;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        break;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        break;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        break;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        break;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        break;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        break;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        break;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        break;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                break;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                break;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                break;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        break;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        break;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        break;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        break;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        break;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        break;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        break;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        break;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        break;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        break;
                                }
                        }
                }
        }
    }

    public static boolean d(int i7, Object obj) {
        int i10;
        if (!(obj instanceof Db.c)) {
            return false;
        }
        if (obj instanceof h) {
            i10 = ((h) obj).getArity();
        } else if (obj instanceof Rb.a) {
            i10 = 0;
        } else if (obj instanceof Rb.c) {
            i10 = 1;
        } else if (obj instanceof Rb.e) {
            i10 = 2;
        } else if (obj instanceof Rb.f) {
            i10 = 3;
        } else if (obj instanceof Rb.g) {
            i10 = 4;
        } else if (obj instanceof Rb.h) {
            i10 = 5;
        } else if (obj instanceof Rb.i) {
            i10 = 6;
        } else {
            boolean z8 = obj instanceof Y.b;
            i10 = z8 ? 7 : z8 ? 8 : z8 ? 9 : z8 ? 10 : z8 ? 11 : z8 ? 13 : z8 ? 14 : z8 ? 15 : z8 ? 16 : z8 ? 17 : z8 ? 18 : z8 ? 19 : z8 ? 20 : z8 ? 21 : -1;
        }
        return i10 == i7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return "Double";
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d6, code lost:
    
        if (r10.equals("kotlin.jvm.internal.StringCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01fc, code lost:
    
        if (r10.equals("kotlin.jvm.internal.FloatCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0206, code lost:
    
        if (r10.equals("java.lang.Long") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
    
        return "Long";
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0221, code lost:
    
        if (r10.equals("java.lang.Byte") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:?, code lost:
    
        return "Byte";
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x022e, code lost:
    
        if (r10.equals("java.lang.Boolean") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:?, code lost:
    
        return "Boolean";
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023b, code lost:
    
        if (r10.equals("kotlin.jvm.internal.EnumCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0245, code lost:
    
        if (r10.equals("java.lang.Character") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:?, code lost:
    
        return "Char";
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0252, code lost:
    
        if (r10.equals("short") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:?, code lost:
    
        return "Short";
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x025f, code lost:
    
        if (r10.equals("float") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:?, code lost:
    
        return "Float";
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x026c, code lost:
    
        if (r10.equals("kotlin.jvm.internal.ShortCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0284, code lost:
    
        if (r10.equals("boolean") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x028e, code lost:
    
        if (r10.equals("long") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0298, code lost:
    
        if (r10.equals("char") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02a2, code lost:
    
        if (r10.equals("byte") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02c4, code lost:
    
        if (r10.equals("kotlin.jvm.internal.LongCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02ce, code lost:
    
        if (r10.equals("kotlin.jvm.internal.CharCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02d8, code lost:
    
        if (r10.equals("java.lang.Short") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02e2, code lost:
    
        if (r10.equals("java.lang.Float") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0308, code lost:
    
        if (r10.equals("kotlin.jvm.internal.ByteCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0311, code lost:
    
        if (r10.equals("double") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x035f, code lost:
    
        if (r10.equals("kotlin.jvm.internal.DoubleCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016c, code lost:
    
        if (r10.equals("kotlin.jvm.internal.IntCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
    
        return "Companion";
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0187, code lost:
    
        if (r10.equals("kotlin.jvm.internal.BooleanCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c9, code lost:
    
        if (r10.equals("java.lang.Double") == false) goto L253;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0361 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String e(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                break;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                break;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                break;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                break;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                break;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                break;
            case -1325958191:
                break;
            case -1182275604:
                break;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                break;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                break;
            case -527879800:
                break;
            case -515992664:
                break;
            case -246476834:
                break;
            case -207262728:
                break;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                break;
            case 3039496:
                break;
            case 3052374:
                break;
            case 3327612:
                break;
            case 64711720:
                break;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                break;
            case 77230534:
                break;
            case 97526364:
                break;
            case 109413500:
                break;
            case 155276373:
                break;
            case 226173651:
                break;
            case 344809556:
                break;
            case 398507100:
                break;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                break;
            case 398795216:
                break;
            case 482629606:
                break;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                break;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                break;
            case 599019395:
                break;
            case 761287205:
                break;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                break;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                break;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                break;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                break;
            case 1383693018:
                break;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                break;
            case 1877171123:
                break;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        break;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        break;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        break;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        break;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        break;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        break;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        break;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        break;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        break;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        break;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                break;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                break;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                break;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        break;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        break;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        break;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        break;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        break;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        break;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        break;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        break;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        break;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        break;
                                }
                        }
                }
        }
    }

    public static void f(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(X.c.i(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        l.i(classCastException, y.class.getName());
        throw classCastException;
    }
}
