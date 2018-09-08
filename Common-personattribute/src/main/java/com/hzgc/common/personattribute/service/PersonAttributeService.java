package com.hzgc.common.personattribute.service;

import com.hzgc.common.personattribute.bean.PersonAttributes;
import com.hzgc.common.personattribute.bean.PersonAttributeValue;
import com.hzgc.common.personattribute.bean.PersonLogistic;
import com.hzgc.seemmo.service.ReadPersonInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 *行人属性查询
 */
public class PersonAttributeService {
    public List<PersonAttributes> getPersonAttribute(){
        List<PersonAttributes> personAttributes = new ArrayList<>();
        ReadPersonInfo readPersonInfo = new ReadPersonInfo();
        Map<String,Map<Integer,String>> personMap = readPersonInfo.getPersonMap();

        //行人年龄
        Map<Integer ,String> ageMap = personMap.get("age_code");
        PersonAttributes personAge =new PersonAttributes();
        personAge.setIdentify("age");
        personAge.setDesc("年龄");
        personAge.setPersonLogistic(PersonLogistic.AND);
        List<PersonAttributeValue> personAgeValues = new ArrayList<>();
        for (Map.Entry<Integer,String> entry : ageMap.entrySet()){
            PersonAttributeValue personAttributeValue = new PersonAttributeValue();
            personAttributeValue.setDesc(entry.getValue());
            personAttributeValue.setCode(entry.getKey());
            personAgeValues.add(personAttributeValue);
        }
        personAge.setValues(personAgeValues);
        personAttributes.add(personAge);

        //小孩类型
        Map<Integer ,String> babyMap = personMap.get("baby_code");
        PersonAttributes personBaby = new PersonAttributes();
        personBaby.setIdentify("baby");
        personBaby.setDesc("抱小孩");
        personBaby.setPersonLogistic(PersonLogistic.AND);
        List<PersonAttributeValue> personBabyValues = new ArrayList<>();
        for (Map.Entry<Integer,String> entry : babyMap.entrySet()){
            PersonAttributeValue personAttributeValue = new PersonAttributeValue();
            personAttributeValue.setDesc(entry.getValue());
            personAttributeValue.setCode(entry.getKey());
            personBabyValues.add(personAttributeValue);
        }
        personBaby.setValues(personBabyValues);
        personAttributes.add(personBaby);

        //拎东西
        Map<Integer ,String> bagMap = personMap.get("bag_code");
        PersonAttributes personBag = new PersonAttributes();
        personBag.setIdentify("bag");
        personBag.setDesc("拎东西");
        personBag.setPersonLogistic(PersonLogistic.AND);
        List<PersonAttributeValue> personBagValues = new ArrayList<>();
        for (Map.Entry<Integer,String> entry : bagMap.entrySet()){
            PersonAttributeValue personAttributeValue = new PersonAttributeValue();
            personAttributeValue.setDesc(entry.getValue());
            personAttributeValue.setCode(entry.getKey());
            personBagValues.add(personAttributeValue);
        }
        personBag.setValues(personBagValues);
        personAttributes.add(personBag);

        //下衣颜色
        Map<Integer ,String> bottomColorMap = personMap.get("bottomcolor_code");
        PersonAttributes personBottomColor = new PersonAttributes();
        personBottomColor.setIdentify("bottomColor");
        personBottomColor.setDesc("下衣颜色");
        personBottomColor.setPersonLogistic(PersonLogistic.AND);
        List<PersonAttributeValue> personBottomColorValues = new ArrayList<>();
        for (Map.Entry<Integer,String> entry : bottomColorMap.entrySet()){
            PersonAttributeValue personAttributeValue = new PersonAttributeValue();
            personAttributeValue.setDesc(entry.getValue());
            personAttributeValue.setCode(entry.getKey());
            personBottomColorValues.add(personAttributeValue);
        }
        personBottomColor.setValues(personBottomColorValues);
        personAttributes.add(personBottomColor);

        //下衣类型
        Map<Integer ,String> bottomTypeMap = personMap.get("bottomtype_code");
        PersonAttributes personBottomType = new PersonAttributes();
        personBottomType.setIdentify("bottomType");
        personBottomType.setDesc("下衣类型");
        personBottomType.setPersonLogistic(PersonLogistic.AND);
        List<PersonAttributeValue> personBottomTypeValues = new ArrayList<>();
        for (Map.Entry<Integer,String> entry : bottomTypeMap.entrySet()){
            PersonAttributeValue personAttributeValue = new PersonAttributeValue();
            personAttributeValue.setDesc(entry.getValue());
            personAttributeValue.setCode(entry.getKey());
            personBottomTypeValues.add(personAttributeValue);
        }
        personBottomType.setValues(personBottomTypeValues);
        personAttributes.add(personBottomType);

        //帽子类型
        Map<Integer ,String> hatMap = personMap.get("hat_code");
        PersonAttributes personHat = new PersonAttributes();
        personHat.setIdentify("hat");
        personHat.setDesc("帽子");
        personHat.setPersonLogistic(PersonLogistic.AND);
        List<PersonAttributeValue> personHatValues = new ArrayList<>();
        for (Map.Entry<Integer,String> entry : hatMap.entrySet()){
            PersonAttributeValue personAttributeValue = new PersonAttributeValue();
            personAttributeValue.setDesc(entry.getValue());
            personAttributeValue.setCode(entry.getKey());
            personHatValues.add(personAttributeValue);
        }
        personHat.setValues(personHatValues);
        personAttributes.add(personHat);

        //头发类型
        Map<Integer ,String> hairMap = personMap.get("hair_code");
        PersonAttributes personHair = new PersonAttributes();
        personHair.setIdentify("hair");
        personHair.setDesc("头发");
        personHair.setPersonLogistic(PersonLogistic.AND);
        List<PersonAttributeValue> personHairValues = new ArrayList<>();
        for (Map.Entry<Integer,String> entry : hairMap.entrySet()){
            PersonAttributeValue personAttributeValue = new PersonAttributeValue();
            personAttributeValue.setDesc(entry.getValue());
            personAttributeValue.setCode(entry.getKey());
            personHairValues.add(personAttributeValue);
        }
        personHair.setValues(personHairValues);
        personAttributes.add(personHair);

        //背包类型
        Map<Integer ,String> knapsackMap = personMap.get("knapsack_code");
        PersonAttributes personKnapsack = new PersonAttributes();
        personKnapsack.setIdentify("knapsack");
        personKnapsack.setDesc("双肩包");
        personKnapsack.setPersonLogistic(PersonLogistic.AND);
        List<PersonAttributeValue> personKnapsackValues = new ArrayList<>();
        for (Map.Entry<Integer,String> entry : knapsackMap.entrySet()){
            PersonAttributeValue personAttributeValue = new PersonAttributeValue();
            personAttributeValue.setDesc(entry.getValue());
            personAttributeValue.setCode(entry.getKey());
            personKnapsackValues.add(personAttributeValue);
        }
        personKnapsack.setValues(personKnapsackValues);
        personAttributes.add(personKnapsack);

        //背包方式
        Map<Integer ,String> messengerBag = personMap.get("messengerbag_code");
        PersonAttributes personMessengerBag = new PersonAttributes();
        personMessengerBag.setIdentify("messengerBag");
        personMessengerBag.setDesc("斜挎包");
        personMessengerBag.setPersonLogistic(PersonLogistic.AND);
        List<PersonAttributeValue> personMessenegerBagValues = new ArrayList<>();
        for (Map.Entry<Integer,String> entry : messengerBag.entrySet()){
            PersonAttributeValue personAttributeValue = new PersonAttributeValue();
            personAttributeValue.setDesc(entry.getValue());
            personAttributeValue.setCode(entry.getKey());
            personMessenegerBagValues.add(personAttributeValue);
        }
        personMessengerBag.setValues(personMessenegerBagValues);
        personAttributes.add(personMessengerBag);

        //行人方向
        Map<Integer ,String> orientation = personMap.get("orientation_code");
        PersonAttributes personOrientationBag = new PersonAttributes();
        personOrientationBag.setIdentify("orientation");
        personOrientationBag.setDesc("朝向");
        personOrientationBag.setPersonLogistic(PersonLogistic.AND);
        List<PersonAttributeValue> personOrientationValues = new ArrayList<>();
        for (Map.Entry<Integer,String> entry : orientation.entrySet()){
            PersonAttributeValue personAttributeValue = new PersonAttributeValue();
            personAttributeValue.setDesc(entry.getValue());
            personAttributeValue.setCode(entry.getKey());
            personOrientationValues.add(personAttributeValue);
        }
        personOrientationBag.setValues(personOrientationValues);
        personAttributes.add(personOrientationBag);

        //性别
        Map<Integer ,String> sex = personMap.get("sex_code");
        PersonAttributes personSex = new PersonAttributes();
        personSex.setIdentify("sex");
        personSex.setDesc("性别");
        personSex.setPersonLogistic(PersonLogistic.AND);
        List<PersonAttributeValue> personSexValues = new ArrayList<>();
        for (Map.Entry<Integer,String> entry : sex.entrySet()){
            PersonAttributeValue personAttributeValue = new PersonAttributeValue();
            personAttributeValue.setDesc(entry.getValue());
            personAttributeValue.setCode(entry.getKey());
            personSexValues.add(personAttributeValue);
        }
        personSex.setValues(personSexValues);
        personAttributes.add(personSex);

        //肩上的包
        Map<Integer ,String> shoudlerBag = personMap.get("shoulderbag_code");
        PersonAttributes personShoudlerBag= new PersonAttributes();
        personShoudlerBag.setIdentify("shoulderBag");
        personShoudlerBag.setDesc("单肩包");
        personShoudlerBag.setPersonLogistic(PersonLogistic.AND);
        List<PersonAttributeValue> personShoudlerBagValues = new ArrayList<>();
        for (Map.Entry<Integer,String> entry : shoudlerBag.entrySet()){
            PersonAttributeValue personAttributeValue = new PersonAttributeValue();
            personAttributeValue.setDesc(entry.getValue());
            personAttributeValue.setCode(entry.getKey());
            personShoudlerBagValues.add(personAttributeValue);
        }
        personShoudlerBag.setValues(personShoudlerBagValues);
        personAttributes.add(personShoudlerBag);

        //雨伞
        Map<Integer ,String> umbrella = personMap.get("umbrella_code");
        PersonAttributes personUmbrella= new PersonAttributes();
        personUmbrella.setIdentify("umbrella");
        personUmbrella.setDesc("雨伞");
        personUmbrella.setPersonLogistic(PersonLogistic.AND);
        List<PersonAttributeValue> personUmbrellaValues = new ArrayList<>();
        for (Map.Entry<Integer,String> entry : umbrella.entrySet()){
            PersonAttributeValue personAttributeValue = new PersonAttributeValue();
            personAttributeValue.setDesc(entry.getValue());
            personAttributeValue.setCode(entry.getKey());
            personUmbrellaValues.add(personAttributeValue);
        }
        personUmbrella.setValues(personUmbrellaValues);
        personAttributes.add(personUmbrella);

        //上衣颜色
        Map<Integer ,String> upperColor = personMap.get("uppercolor_code");
        PersonAttributes personUpperColor= new PersonAttributes();
        personUpperColor.setIdentify("upperColor");
        personUpperColor.setDesc("上衣颜色");
        personUpperColor.setPersonLogistic(PersonLogistic.AND);
        List<PersonAttributeValue> personUpperColorValues = new ArrayList<>();
        for (Map.Entry<Integer,String> entry : upperColor.entrySet()){
            PersonAttributeValue personAttributeValue = new PersonAttributeValue();
            personAttributeValue.setDesc(entry.getValue());
            personAttributeValue.setCode(entry.getKey());
            personUpperColorValues.add(personAttributeValue);
        }
        personUpperColor.setValues(personUpperColorValues);
        personAttributes.add(personUpperColor);

        //上衣类型
        Map<Integer ,String> upperType = personMap.get("uppertype_code");
        PersonAttributes personUpperType= new PersonAttributes();
        personUpperType.setIdentify("upperType");
        personUpperType.setDesc("上衣类型");
        personUpperType.setPersonLogistic(PersonLogistic.AND);
        List<PersonAttributeValue> personUpperTypeValues = new ArrayList<>();
        for (Map.Entry<Integer,String> entry : upperType.entrySet()){
            PersonAttributeValue personAttributeValue = new PersonAttributeValue();
            personAttributeValue.setDesc(entry.getValue());
            personAttributeValue.setCode(entry.getKey());
            personUpperTypeValues.add(personAttributeValue);
        }
        personUpperType.setValues(personUpperTypeValues);
        personAttributes.add(personUpperType);

        //车辆类型
        Map<Integer ,String> type = personMap.get("car_type");
        PersonAttributes personCarType= new PersonAttributes();
        personCarType.setIdentify("carType");
        personCarType.setDesc("车辆类型");
        personCarType.setPersonLogistic(PersonLogistic.AND);
        List<PersonAttributeValue> personCarTypeValues = new ArrayList<>();
        for (Map.Entry<Integer,String> entry : type.entrySet()){
            PersonAttributeValue personAttributeValue = new PersonAttributeValue();
            personAttributeValue.setDesc(entry.getValue());
            personAttributeValue.setCode(entry.getKey());
            personCarTypeValues.add(personAttributeValue);
        }
        personCarType.setValues(personCarTypeValues);
        personAttributes.add(personCarType);
        return personAttributes;
    }
}
