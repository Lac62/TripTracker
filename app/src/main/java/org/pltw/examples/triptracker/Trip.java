package org.pltw.examples.triptracker;

import java.util.Date;

/**
 * Created by rcarpenter on 11/15/2017.
 */

public class Trip implements IntentData{

     private String objectId;
     private String name;
     private String description;
     private Date startDate;
     private Date endDate;
     private boolean shared;


             public Trip(){
                    this.setStartDate(new Date());
                    this.setEndDate(new Date());
                }


             public String getObjectId() {
                    return objectId;
                }

             public void setObjectId(String objectId) {
                    this.objectId = objectId;
                }

             public String getName() {
                    return name;
                }

             public void setName(String name) {
                    this.name = name;
                }

             public String getDescription() {
                    return description;
                }

             public void setDescription(String description) {
                    this.description = description;
                }

             public Date getStartDate() {
                    return startDate;
                }

             public void setStartDate(Date startDate) {
                    this.startDate = startDate;
                }

             public Date getEndDate() {
                    return endDate;
                }

             public void setEndDate(Date endDate) {
                    this.endDate = endDate;
                }

             public boolean isShared() {
                    return shared;
                }

             public void setShared(boolean shared) {
                    this.shared = shared;
                }
 }

